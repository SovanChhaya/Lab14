package handong.edu.csee.java.Lab14.prob04;// package name for lab1 problem 04
import java.util.*;// import java keyboard scanner 
public class BoundaryMain {// class that implement the result

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);// instantiate keyboard in put 
		int numInput = 0;//local variable
		Boundary myObject = new Boundary();// instantiate Boundary class
		boolean myRepeat = true;// local variable
		while(myRepeat)// loop statement 
		{
			try
			{
				System.out.print("Enter an integer: ");// print out Enter an integer:

				numInput = keyboard.nextInt();// input number
				myObject.receive(numInput);// receive the number from input
			}
			catch(ArrayIndexOutOfBoundsException e)// catch ArrayIndexOutOfBoundsException
			{
				System.out.println("Invalid array index access!");// print out Invalid array index access!
				myRepeat = false;
			}
		}


	}

}
