//Classe ExemploArray.java
import java.util.Scanner;

class NonoPrograma{
	public static void main(String args[]){
		int [] vetor = new int[10];
		System.out.println("Tamanho vetor:"+vetor.length);
		for(int i=0; i<vetor.length; i++){
			vetor[i] = i;
			System.out.println(vetor[i]);
		}
	}
}
