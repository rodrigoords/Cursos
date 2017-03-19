package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/controller")
public class Controller extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String tarefa = req.getParameter("tarefa");
		
		if (tarefa == null){
			throw new IllegalArgumentException("Você esqueceu de passar a tarefa");
		}
		tarefa = "br.com.alura.gerenciador.web."+tarefa;
		try {
			
			Class<?> tarefaExecutar = Class.forName(tarefa);
			Tarefa newInstance = (Tarefa)tarefaExecutar.newInstance();
			
			String executa = newInstance.executa(req, resp);
			req.getRequestDispatcher(executa).forward(req, resp);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ServletException(e);
		}
		
	}
}
