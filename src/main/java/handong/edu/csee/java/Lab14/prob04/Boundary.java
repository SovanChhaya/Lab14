package handong.edu.csee.java.Lab14.prob04;// package name for lab1 problem 04

public class Boundary {// class implement array of number 
	int [] myArray = new int[5];// instance variable 
	int count = 0;// instance variable
	public void receive(int numOfArray) throws ArrayIndexOutOfBoundsException// method that throw ArrayIndexOutOfBoundsException
	{
		int i = count;// local variable
		myArray[i] = numOfArray;
		count++;
		// number array not more than 5 
		System.out.printf("myArray[%d] < - %d\n", i, numOfArray);// print out Array index and result number of array
	}


}
