package iut.tdd;


public class Convert {
	static String [] chiffre ={"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","20"};
	static String [] chiffreenlettre ={"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf","dix","onze","douze","treize","quatorze","quinze","seize","vingt"};
	
		
	
	public static String num2text(String input) {
		for (int i = 0 ; i<chiffre.length;i++){
			if (chiffre[i].equals(input)){
				return chiffreenlettre[i];
			}
			
		}
		
		return null;
	}
	public static String text2num(String input) {
		return null;
	}
}