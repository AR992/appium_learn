package testmobile;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object //String literal
		String s = "Ajdin R test";
		//String s1 = "Ajdin R";
		
		// new key word
		String s2 = new String("Welcome!");
		String s3 = new String("Welcome!");
		
		String[] splittedString = s.split("R");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());
		
		for(int i = s.length()-1; i>=0; i--){
			System.out.println(s.charAt(i));
		}

	}

}
