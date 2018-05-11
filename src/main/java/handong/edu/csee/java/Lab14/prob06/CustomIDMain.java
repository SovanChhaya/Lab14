package handong.edu.csee.java.Lab14.prob06;// package name for lab14 problem 06

import java.util.Scanner;// import keyboard scanner

public class CustomIDMain {// main class that implement the result

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputName, inputRace;// local variable
		int inputAge = 0;// local variable 
		Scanner keyboard = new Scanner(System.in);// instantiate keyboard input
		CustomID obj = new CustomID();// instantiate method setRace
		boolean repeat = true;// local variable

		while(repeat)// while statement 
		{
			try {
				if(obj.getState() == 0) {// if state from getState equal 0 
					System.out.print("Enter your name: ");//print out Enter your name: 
					inputName = keyboard.nextLine();// input name 
					obj.inPutName(inputName);// check name that input compare the condition in inPutName method
				}
				else if(obj.getState() == 1) {// if  state from getState equal 1 
					System.out.print("Enter your age: ");//print out Enter your age:
					inputAge = keyboard.nextInt();// input name 
					//keyboard.nextLine();
					obj.inPutAge(inputAge);// check name that input compare the condition in inPutAge method
				}
				else if(obj.getState() == 2) {// if  state from getState equal 2
					System.out.print("Enter your race: ");//print out Enter your race:
					inputRace= keyboard.nextLine();// input Race name
					obj.setRace(inputRace);// check name that input compare the condition in setRace method
				}
			}
			catch(Exception e){// catch Exception 
				System.out.println(e.getMessage());//print out the Exception Message
				continue;
			}
		}
	}

}





