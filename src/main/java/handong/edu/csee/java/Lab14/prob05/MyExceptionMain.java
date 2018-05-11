package handong.edu.csee.java.Lab14.prob05;//package name for problem 05

import java.util.Scanner;// import scanner keyboard input

public class MyExceptionMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner keyboard = new Scanner(System.in);// instantiate scan keyboard 
			String str = keyboard.nextLine();// input something 
			MyExceptionMain.myTest(str);// instantiate from input 
		} catch(MyException mae){// catch Exception
			System.out.println("Inside catch block: " + mae);// print out Inside catch block:
		}
	}

	static void myTest(String str) throws MyException{//throw the Exception 
		if(str.equals("null")){//if input null 
			throw new MyException("String val is null");// throw Exception print out String val is null
		}
		else// out of condition
			System.out.println("String val is:" + str);//print out String val is: what user input
	}
}

