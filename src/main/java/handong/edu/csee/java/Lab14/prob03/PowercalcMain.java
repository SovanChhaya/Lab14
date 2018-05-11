package handong.edu.csee.java.Lab14.prob03;// package name for lab14 problem 03

import java.util.Scanner;// // import keyboard scanner for input something


public class PowercalcMain {// main class that implement the result 

	public static  Powercalc myCalculate = new Powercalc();// instantiate Powercalc class 
	public static  Scanner in = new Scanner(System.in);// instantiate keyboard input

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		while (in.hasNextInt()) {// check next integer 3
			

			int numN = in.nextInt();// input numberN
			int numP = in.nextInt();// input numberP

			try {

				System.out.println(myCalculate.powerNumber(numN , numP));// the result of power 

			}catch (Exception e) {// catch the Exception
				System.out.println(e);// print out the exception 
			}


		}
	}
}
