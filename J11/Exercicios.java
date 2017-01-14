class Exercicios{
	public static void main(String[] args){
		System.out.println("============ Exercicio 1 ============");
    for(int i = 150; i <= 300; i++ ){
      System.out.println(i);
    }

		System.out.println("============ Exercicio 2 ============");
    int resultado = 0;
    for(int i = 1; i <= 1000; i++){
      resultado += i;
    }

    System.out.println("Resultado: "+resultado);

		System.out.println("============ Exercicio 3 ============");
    for(int i= 1; i <= 100; i++){
      if(i%3==0){
        System.out.println("Valor: "+i+" é multiplo de 3");
      }
    }

		System.out.println("============ Exercicio 4 ============");
    int acumulado=1;
    for(int i = 1; i <= 10; i++){
      acumulado = i * acumulado;
      System.out.println("Fatoral de "+i+" é ("+(i-1)+"!) * "+i+" = "+acumulado );
    }

		System.out.println("============ Exercicio 5 ============");

		System.out.println("============ Exercicio 6 ============");
    int qtdRepeticao =10;
    int anterior = 0;
    int atual = 1;
    for(int i = 0; i < 10; i ++){
      if(i == 0){
        System.out.print(0 + ",");
      }else{
        System.out.print(anterior + atual+",");
        anterior += atual;
        atual    = (anterior - atual);
      }

    }
    System.out.println();
		System.out.println("============ Exercicio 7 ============");
    int entrada = 13;
    while(entrada > 1){
      if(entrada%2 == 0){
        entrada = entrada/2;
      }else{
        entrada = (entrada*3)+1;
      }
      System.out.print(entrada+"->");
    }
    System.out.println();
		System.out.println("============ Exercicio 8 ============");

	}
}
