package handong.edu.csee.java.Lab14.prob06;// package name for lab14 problem 06

public class CustomID extends Exception {// CustomID (subclass) extends from Exception  
	
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};// instance variable 
	private String name = "";// instance variable
	private int age = 0;// instance variable
	private String race = "";// instance variable
	private int state = 0;// instance variable

	public void inPutName(String inPutName) throws Exception// method that throw the Exception
	{
		if(inPutName.length() < 5) {// if length of name more than 5
			state = 0;
			throw new Exception("Your name is short! Try again!");// print out Your name is short! Try again!
		}

		else {// out of condition  if
			this.name = inPutName;// local variable
			System.out.println("Name is valid");// print out Name is valid
			System.out.println("Name: " + this.name);// print out Name from user input
			state++;
		}
	}



	public void inPutAge(int inPutAge) throws Exception// method implement age input that throw the Exception
	{
		if(inPutAge < 18) {// if input age more than 18
			state = 1;
			throw new Exception("You are too young! Try again!");// throw Exception print out You are too young! Try again!
		}
		else {// out of condition if
			this.age = inPutAge;// local variable
			System.out.println("Age is valid");// print out Age is valid
			System.out.println("Age: " + this.age);// print out Age from user input
			state++;
		}
	}

	public void setRace(String race) throws Exception{// method implement race and throw the aException  
		for(int i = 0; i < races.length; i++)// for loop race length
		{
			if(races[i].equals(race)) {// if input race the same value of array race[i]
				this.race = races[i];
				System.out.println("Race is valid");// print out Race is valid
				System.out.println("Race: " + races[i]);// print out the Race name
				state = 0;
				return;
			}
		}
		state = 2;
		throw new Exception("Human! Try again.");// throw the Exception print out Human! Try again.
	}
	public int getState()// method
	{
		return state;// return state
	}

}
