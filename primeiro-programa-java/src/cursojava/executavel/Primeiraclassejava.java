package cursojava.executavel;

public class Primeiraclassejava {
	/*Vari�vel global, acess�vel a todos e tem o valor compartilhado
	 * O que torna ela local � o fato dela est� fora do "m�todo main" */
	static int maiorIdadeGlobal = 30;
	
	
	/* Main � um m�todo auto executalvel em java*/
	public static void main(String[] args) {
		
		/* vari�vel local, pois pertence apenas a esse m�todo*/
		int maiorIdade = 18;
		int Idoso = 60;
		int adolescente = 16;
		int Crianca = 7;
		String cpf = "067.262.564-42";
		
		System.out.println("Maior idade � :" + maiorIdade);
		metodo2();
		/* foi necess�rio invocar o (metodo2) para que ele fosse mostrado na tela*/
		
		
	}
		
		
		public static void metodo2() {
			
			System.out.println("Valor da Global � :"+ maiorIdadeGlobal );
		
		
		
		
		
				
		
	}	
}
