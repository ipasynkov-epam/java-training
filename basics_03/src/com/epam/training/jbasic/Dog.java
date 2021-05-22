package com.epam.training.jbasic;

import java.io.FileNotFoundException;

public class Dog extends Animal {

	public String methodPublic() throws FileNotFoundException {
		return "methodPublic Dog";
	}

	public String whoAmI(){
		return super.whoAmI() + " and I'm a Dog";
	}

	protected String methodProtected() {
		return "methodProtected Dog";
	}

	private String methodPrivate() {
		return "methodPrivate Dog";
	}

	public void exceptionMethod(String s) {
		if (s != null){

		}
		try {
			System.out.println(s.toString());
		} catch (NullPointerException ex) {
			System.out.println("String is null");
		}

	}

	public void exceptionMethod2(int[] arr){
		int i = 0;
		try{
			while(true){
				System.out.println("array elem is: " + arr[i]);
				i++;
			}
		}catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("Finished");
		}

		for(int idx : arr){
			System.out.println("array elem is: " + idx);
		}
	}

	//	public String methodPublicFinal(){
	//		return "methodPublicFinal Dog";
	//	}
	//
	//	public String methodPublicStatic(){
	//		return "methodPublicStatic Dog";
	//	}
}
