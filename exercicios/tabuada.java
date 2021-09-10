import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tabuada{

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		int i, n;

		System.out.printf("Informe o número para a tabuada:");
		n = ler.nextInt();

		FileWriter arq = new FileWriter("tabuada.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf("+--Resultado--+%n");
		for(i=0; i<11; i++){
			gravarArq.printf("| %2d X %d = %2d | %n", i, n, (i*n));
		}
		gravarArq.printf("+----------%n");

		arq.close();

		System.out.printf("/nTabuada do %d foi gravada com sucesso em tabuada.txt", n);
	}
}
