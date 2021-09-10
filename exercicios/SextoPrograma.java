//Classe ExemploSwitch.java
class SextoPrograma{
	public static void main(String args[]){
		switch(args[0].charAt(0)){
			case 'A':System.out.println("Vogal A");
				break;
			case 'B':System.out.println("Vogal B");
				break;
			default:System.out.println("Não é vogal");
				break;
		}
	}
}
