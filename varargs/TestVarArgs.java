package com.demo.varargs;

public class TestVarArgs {

	// this method will print the entire contents of the parameter passed in

	public void printVarArgArray(int... x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");
		}
	}

	public static void main(String[] args) {

		TestVarArgs obj = new TestVarArgs();
		 
		 //Using an array:
		 int[] testArray = new int[]{10, 20};
		 obj.printVarArgArray(testArray);
		 
		 System.out.println(" ");
		 
		 //Using a sequence of arguments
		 obj.printVarArgArray(5, 6, 5, 8, 6, 31);

	}

}
