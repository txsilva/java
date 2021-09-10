//Classe ExemploMatriz.java

class OnzePrograma{
	public static void main(String args[]){
		int [][] matriz = new int [4][4];
		for(int i=0; i<matriz.length; i++){
			System.out.println("Linha: "+i);
			for(int j=0; j<matriz.length; j++){
				matriz[i][j]=i+j;
				System.out.println("Valores da coluna " + matriz[i][j]);
			}
		}
	}
}
