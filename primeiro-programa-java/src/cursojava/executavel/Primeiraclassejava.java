package cursojava.executavel;

public class Primeiraclassejava {
	/*Variável global, acessível a todos e tem o valor compartilhado
	 * O que torna ela local é o fato dela está fora do "método main" */
	static int maiorIdadeGlobal = 30;
	
	
	/* Main é um método auto executalvel em java*/
	public static void main(String[] args) {
		
		/* variável local, pois pertence apenas a esse método*/
		int maiorIdade = 18;
		int Idoso = 60;
		int adolescente = 16;
		int Crianca = 7;
		String cpf = "067.262.564-42";
		
		System.out.println("Maior idade é :" + maiorIdade);
		metodo2();
		/* foi necessário invocar o (metodo2) para que ele fosse mostrado na tela*/
		
		
	}
		
		
		public static void metodo2() {
			
			System.out.println("Valor da Global é :"+ maiorIdadeGlobal );
		
		
		
		
		
				
		
	}	
}
