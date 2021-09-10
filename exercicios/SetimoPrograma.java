//Classe ExemploWhile.java
import java.util.Scanner;

class SetimoPrograma{
	public static void main(String args[]){
		int min, max;
		Scanner entradas = new Scanner(System.in);
		System.out.println("Digite o valor minimo:");
		min = entradas.nextInt();
		System.out.println("Digite o valor maximo");
		max = entradas.nextInt();
		do{
			System.out.println("" + min + " < " + max);
			min++;
			max--;
		}while(min < max);
		System.out.println("" + min + " < " + max + " Condicao invalida.");
	}
}
