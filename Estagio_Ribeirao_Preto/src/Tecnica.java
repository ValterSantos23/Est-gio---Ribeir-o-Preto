import java.util.Scanner;

public class Tecnica {
// Técnica:
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Questão 1)
		System.out.println("Digite um número para verificar se pertence à sequência de Fibonacci:");
	    int numero = sc.nextInt();
	    sc.nextLine();
	    
	    System.out.println(QuestaoUm(numero));
	    
		//Questão 2)
		System.out.print("Digite uma string: ");
		String entrada = sc.nextLine();
		
		System.out.println(QuestaoDois(entrada));
		
		//Questão 3)
		System.out.println("Valor da variável SOMA: "+QuestaoTres());
		
		/* Questão 4)
		 * a) A lógica se dá pela sequência de números impares:
		 * 1, 3, 5, 7, 9
		 * 
		 * b) A lógica é que o próximo número será o anterior vezes 2:
		 * 2, 4, 8, 16, 32, 64, 128
		 * 
		 * c) A lógica se dá pela sequência dos quadrados perfeitos (0^2, 1^2, 2^2, 3^2, 4^2, 5^2, 6^2, 7^2...):
		 * 0, 1, 4, 9, 16, 25, 36, 49
		 * 
		 * d) A lógica se dá pela sequência dos quadrados perfeitos, apenas dos números pares (2^2, 4^2, 6^2, 8^2, 10^2...):
		 * 4, 16, 36, 64, 100
		 * 
		 * e) A lógica se dá pela sequência de Fibonacci, onde o próximo número é a soma dos dois anteriores, tendo como caso base os dois primeiros números sendo 0 e 1, respectivamente:
		 * 1, 1, 2, 3, 5, 8, 13
		 * 
		 * f) A sequência conta como caso base 2 e 10, sendo o terceiro número da sequência a soma deles e os demais soma um ao seu anterior:
		 * 2,10, 12, 16, 17, 18, 19, 20
		 * 
		 */
		
		/* Questão 5)
		 * Resposta: Eu deixaria uma das 3 lâmpadas ligada por muito tempo e depois a desligaria, em seguida, ligaria uma outra lâmpada e a terceira permaneceria desligada.
		 * Ao realizar as duas idas, eu saberia que caso a lâmpada estivesse fria e desligada, ela estaria conectada ao interruptor nunca ligado, caso a lâmpada estivesse quente e desligada,
		 * ela seria a conectada ao interruptor ligado por muito tempo e despois desligado. Por fim, caso a lâmpada estivesse ligada, ela seria conectado ao conector que permaneceu ligado.
		 * Com duas idas, saberia qual seriam as duas lâmpadas e restaria apena o último interruptor para a lâmpada da sala não visitada.
		 */
	}
	
	//Funções para cada questão (1 até 3):
	
	public static String QuestaoUm(int numero) {    
	    // Variáveis para os primeiros números da sequência de Fibonacci
	    int num1 = 0, num2 = 1;
	    
	    // Verificar diretamente se o número é 0 ou 1, que são parte da sequência
	    if (numero == num1 || numero == num2) {
	        return "O número " + numero + " pertence à sequência de Fibonacci.";
	    } else {
	        // Variável para armazenar o próximo número da sequência
	        int proximoNum = num1 + num2;
	
	        // Loop para gerar a sequência de Fibonacci
	        while (proximoNum <= numero) {
	            if (proximoNum == numero) {
	                return "O número " + numero + " pertence à sequência de Fibonacci.";
	            }
	            
	            // Atualizar os números da sequência
	            num1 = num2;
	            num2 = proximoNum;
	            proximoNum = num1 + num2;
	        }
	        // Caso o número não pertença à sequência de Fibonacci:
	        return "O número " + numero + " NÃO pertence à sequência de Fibonacci.";
	    }
	}
	
	public static String QuestaoDois(String entrada) {
		// Variável para contar a quantidade de ocorrências de 'a' ou 'A'
	    int contador = 0;
	    
	    // Loop para verificar cada caractere da string
	    for (int i = 0; i < entrada.length(); i++) {
	        char c = entrada.charAt(i);
	        
	        // Verifica se o caractere é 'a' ou 'A'
	        if (c == 'a' || c == 'A') {
	            contador++;
	        }
	    }
	    return "Quantidade de vezes em que a letra 'A || a' ocorre: "+contador;
	}
	
	public static int QuestaoTres() {
		int INDICE = 12, SOMA = 0, K = 1;
		while(K < INDICE) {
			K++;
			SOMA = SOMA + K;
		}
		return SOMA;
	}
}
