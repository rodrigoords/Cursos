package br.com.alura.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class MapaDeClasses {
	
	private HashMap<String, String> map = new HashMap<>();
	
	public Class<?> getClass(String nomeClass) throws Exception{
		return Class.forName(map.get(nomeClass));	
	}
	
	public Object getObject(String nomeClass) throws Exception{
		return getClass(nomeClass).newInstance();
	}
	
	public Object getObject(String nomeClass, Object... params) throws Exception{
		
		Class<?>[] tiposParametros = new Class<?>[params.length];
		
		for (int i = 0; i < params.length; i++) {
			tiposParametros[i] = params[i].getClass();
		}
		
		Constructor<?> constructor = this.getClass(nomeClass).getConstructor(tiposParametros);
		
		return constructor.newInstance(params);
	}
	
	
	public Map<String,Object> mapaDeAtributos(Object object) throws Exception{
		
		HashMap<String, Object> retorno = new HashMap<>();
		Class<?> clazz = object.getClass();
		
		for(Field field : clazz.getDeclaredFields()){
			field.setAccessible(true);
			retorno.put(field.getName(), field.get(object));
		}
		
		return retorno;
	}
	
	public void chamaMetodosTest(Object obj) throws Exception{
		Class<?> clazz = obj.getClass();
		for(Method m : clazz.getMethods()){
			if(m.getName().startsWith("test") &&
				m.getReturnType() == void.class &&
				m.getParameterCount() == 0){
				try {
					m.invoke(obj);
				} catch (InvocationTargetException e) {
					e.getTargetException().printStackTrace();
				}
			}
		}
	}
}
