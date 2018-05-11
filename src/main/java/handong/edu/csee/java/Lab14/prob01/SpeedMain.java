package handong.edu.csee.java.Lab14.prob01;// package name for lab14 prob01

import java.util.Random;// import java for random number
import java.util.Scanner;// import java scanner for keyboard input


public class SpeedMain {// main class to implement the result 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mySpeed = new Scanner(System.in);// instantiate the object for keyboard input

		Random numRand = new Random();// instantiate the object for random 
		System.out.print("Set the limit ,officer : ");// print out Set the limit , officer
		int limitSpeed = mySpeed.nextInt();// input the number to random
		int speedRandom = numRand.nextInt(101);// random number not more than 101

		SpeedLimiter printLimit = new SpeedLimiter(limitSpeed , speedRandom);// instantiate object for SpeedLimiter 
		printLimit.warnSpeedlimit();// instantiate the method to print out 
	}

}
