package testmobile;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo1 d1 = new MethodsDemo1();
		d1.getUserData();
		getData2();

	}
	
	//method
	public String getData(){
		
		System.out.println("Hello World");
		return "Ajdin";
		
	}
	
	public static String getData2(){
		
		System.out.println("Hello World");
		return "Ajdin";
		
	}

}
