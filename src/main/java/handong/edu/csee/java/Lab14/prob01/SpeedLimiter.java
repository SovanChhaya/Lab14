package handong.edu.csee.java.Lab14.prob01;// package name for lab14 prob01

public class SpeedLimiter {// class implement the condition 


	public int inputSpeed = 0; // instance variable
	public int numlimit = 0;//instance variable
	public  SpeedLimiter(int limit , int speed) // method control the speed
	{
		numlimit = limit;// local variable 
		inputSpeed= speed;// local variable

	}
	public void warnSpeedlimit() {// method to assume the condition 

		try {
			if(inputSpeed > numlimit)// if input number from user more than number limit
			{
				throw new Exception("Speed limit " + numlimit + " km exceeded !");// throw the message Speed limit ... km exceeded
			}
			System.out.println("you're a law abiding citizen !");//print out you're a law abiding citizen !
		}
		catch(Exception e ) {// catch the Exception
			System.out.println(e.getMessage());// instantiate the getMessage method of Exception
			System.out.println("You are being find ");// print out You are being find 
		}
		System.out.println("You current speed "+ inputSpeed);// print out You current speed  ... .

	}
}

