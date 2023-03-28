package testmobile;

public class childClassDemo extends parentClassDemo{
	
	public void Engine(){
		System.out.println("New Engine");
	}
	
	public void Colour(){
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClassDemo cd = new childClassDemo();
		cd.Colour();
		cd.Brakes();
		cd.Gear();
		cd.Engine();

	}

}
