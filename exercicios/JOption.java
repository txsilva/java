//classe JOption.java
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JOption{
	//Método parado exibe mensagem quando o carro estiver parado
	protected static void parado(){
		JOptionPane.showMessageDialog(null,"Carro parado, avisar a ronda.");
	}
	//Método dez exibe mensagem quando o carro estiver entre 0 e 10 km/h
	protected static void dez(){
		JOptionPane.showMessageDialog(null,"Baixa Velocidade, emitir alerta.");
	}
	//Método calcMulta exibe mensagem quando o carro estiver acima de 50 km/h e calcula o valor da multa
	protected static void calcMulta(int velacima){
		int vel = velacima;
		int taxa = 3;
		int multa = (vel - 50)*taxa;
		JOptionPane.showMessageDialog(null,"A multa calulada é ." + multa);
	}
	//Método multar exibe mensagem quando o carro for ser multado, antes de calcular o valor da multa
	protected static void multar(){
		regra();
		JOptionPane.showMessageDialog(null,"Está sendo multado agora");
	}
	//Método regra exibe mensagem da regra para que um carro seja multado na via
	protected static void regra(){
		JOptionPane.showMessageDialog(null,"Velocidade máxima 50, multa de 3 pesos nacionais por unidade ultrapassada essa velocidade.");
	}
	protected static void sair(){
		String escolher = null;
		escolher = JOptionPane.showInputDialog("Digite Y e continue a blitz ou N para encerrar: ");
		if(escolher == null || escolher.equals("")){
			JOptionPane.showMessageDialog(null, "Nenhuma decisão foi escolhida.");
		}
		if(escolher.equals("y")){
			JOptionPane.showMessageDialog(null, "Sessão encerrada.");
		}
		if(escolher.equals("Y")){
			JOptionPane.showMessageDialog(null, "Sessão encerrada.");
		}
		if(escolher.equals("n")){
			JOptionPane.showMessageDialog(null, "Sessão será continuada.");
		}
		if(escolher.equals("N")){
			JOptionPane.showMessageDialog(null, "Sessão será continuada.");
		}
	}

	public static void main(String[] args){
		String nome = null;
		Integer numero= -1;

		FileReader arq = null;
		PrintWriter arc = null;
		FileOutputStream saida = null;
		FileInputStream entrada = null;

		JOption decidir = new JOption();

		while(nome == null || nome.equals("")){
			nome = JOptionPane.showInputDialog("Qual a velocidade registrada?");
			if(nome == null || nome.equals("")){
				JOptionPane.showMessageDialog(null, "Nenhuma velocidade foi registrada, mire o sensor em um objeto.");
				nome = "";
			}
			if((nome.equals("s")) || (nome.equals("S"))){
				decidir.sair();
				nome = "";
			}else{
				numero = Integer.parseInt(nome);
				try{
					arc = new PrintWriter("Arquivo.txt");
					arc.println("\n" + numero);
					arc.close();
					}catch(IOException e){
						e.printStackTrace();
				}

				try{
					saida = new FileOutputStream("dados.txt");
					saida.write(numero);
					entrada = new FileInputStream("Arquivo.txt");
					System.out.print(entrada.read());
					saida.close();
					entrada.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			if(numero < -1){
				JOptionPane.showMessageDialog(null,"Houve um erro na captura, mire o sensor em um objeto.");
				nome = "";
			}
			if((numero >= 0) && (numero <= 9)){
				if(numero == 0){
					decidir.parado();
				}else{
					decidir.dez();
				}
				nome = "";
			}
			if((numero >= 10) && (numero <= 50)){
				decidir.regra();
				nome = "";
			}
			if(numero > 50){
				decidir.multar();
				decidir.calcMulta(numero);
				nome = "";
			}
		}
		JOptionPane.showMessageDialog(null, "A velocidade registrada foi " + nome + ". Não há multa calculada.");
	}
}
