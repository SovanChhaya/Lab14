package handong.edu.csee.java.Lab14.prob03;// package name for lab14 problem 03

public class Powercalc {// class implement the condition 
	public long powerNumber( int numberN , int numberP) throws Exception {// method that throw the Exception 
		long myPowerResult = 0 ;// local variable

		myPowerResult = (long)Math.pow(numberN, numberP);// numberN power numberP

		if(numberN < 0 || numberP < 0) // if numberN and numberP negative
		{

			throw new Exception("n and p should not be nagative.");// throw Exception print out the message n and p should not be negative.

		}

		if (numberN == 0 && numberP == 0) // if numberN and numberP equal 0
		{
			throw new Exception("n and p should not be zero");// throw the Exception print out n and p should not be zero

		}
		return myPowerResult;// return the result of power


	}

}
