//classe Carro.java
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Carro{
	protected static void andar(){
		JOptionPane.showMessageDialog(null,"Não ultrapasse a velocidade da via.");
	}

	protected static void multar(){
		regra();
		JOptionPane.showMessageDialog(null,"Está sendo multado agora");
	}

	protected static void regra(){
		JOptionPane.showMessageDialog(null,"Velocidade máxima 50, multa de 100 pesos nacionais se ultrapassar essa velocidade.");
	}

	protected static void sair(){
		int encerrar;
		Scanner sair = new Scanner(System.in);
		System.out.println("Digite 0 para gravar a blitz: ");
		encerrar = sair.nextInt();
		if(encerrar == 0){
			JOptionPane.showMessageDialog(null,"Blitz gravada com sucesso.");
		}else{
			JOptionPane.showMessageDialog(null,"Houve um erro e o programa foi encerrado.");
		}
	}

	public static void velocidade(int velocidade){	
		//atributos
		int velocidadeMaxima = 50;
		int velocidadeRecebida = velocidade;
		if(velocidadeRecebida > velocidadeMaxima){
			System.out.println("Está acima do permitido");
			multar();
		}
		if(velocidadeRecebida == velocidadeMaxima){
			System.out.println("Cuidado, pode ser multado");
			regra();
		}
		if((velocidadeRecebida < velocidadeMaxima) && (velocidadeRecebida >= 0)){
			int gradiente = velocidadeMaxima - velocidadeRecebida;
			System.out.println("O Carro está parado, você pode acelerar mais " + gradiente);
			andar();
		}
		if(velocidadeRecebida < 0){
			sair();
		}			
	}

	public static void main(String[] args){
		int velocidadeRegistrada = 1;
		
		Scanner entradas = new Scanner(System.in);
		Carro velocidade = new Carro();
		while(velocidadeRegistrada >= 0){
			System.out.println("\nQual a velocidade registrada: ");
			velocidadeRegistrada = entradas.nextInt();
			velocidade(velocidadeRegistrada);
		}
	}
}
