package handong.edu.csee.java.Lab14.prob02;// package name for lab14 problem 02
import java.util.InputMismatchException;// import package InputMismatchException 

import java.util.Scanner;// import java scanner for keyboard input
public class InException {// class to implement 

	public int NumberX =0 ;//instance variable
	public int NumberY = 0;// instance variable

	public void ExceptionMessage() {// method to implement the condition 

		try {
			Scanner myInput = new Scanner(System.in);// instantiate object for keyboard input
			System.out.print("X: ");// print out X:
			NumberX = myInput.nextInt();// input number of X
			System.out.print("Y: "); //print out Y :
			NumberY = myInput.nextInt();// input number of Y
			int result = NumberX / NumberY ;// calculate numberX and number Y

			System.out.println(result);// print out the result

		}
		catch (ArithmeticException e) {// exception the java ArithmethicException  message
			System.out.println("java.lang.ArithmeticException" + e.getMessage());// print out the message java.lang.ArithmeticException
		}
		catch (InputMismatchException e1) {// InputMismathException 
			System.out.println("java.lang.inputMismatchException"+e1.getMessage());// print out the message java.lang.inputMismatchException

		}
		catch(Exception e2) {// exception message
			System.out.println("Some other exception has ocurred"+ e2.getMessage());// print out Some other exception has ocurred
		}

	}


}
