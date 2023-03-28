package testmobile;

import java.util.ArrayList;

public class CoreJava1 {

	public static void main(String[] args) {
		
		int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};
		
		//2
		// check if array has multiple of 2
		
		for(int i = 0; i<arr2.length; i++) {
			if(arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				break;
			} else {
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		
		ArrayList<String> a = new ArrayList<String>(); //create object
		
		a.add("ajdin");
		a.add("username");
		a.add("lname");
		a.add("fname");
		a.remove(3);
		a.add("haos");
		System.out.println(a.get(3));
		

	}

}
