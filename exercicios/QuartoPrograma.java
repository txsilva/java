//Classe QuartoPrograma.java
import java.util.Scanner;

class QuartoPrograma{
	public static void main(String arg[]){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero ");
		
		//lendo o número digitado no teclado
		int valor = entrada.nextInt();
		System.out.println("o numero digitado " + valor);
	}
}
