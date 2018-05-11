package handong.edu.csee.java.Lab14.prob05;//package name for problem 05

public class MyException extends Exception {// MyException (subclass) extends from Exception 
	private String message = null;// instance variable

	public MyException() {// constructor 
		super();
	}

	public MyException(String message) {// constructor 
		super(message);//local variable
		this.message = message;// local variable
	}

	public MyException(Throwable cause) {// constructor
		super(cause);
	}

	public String toString() {//constructor
		return message;

	}
}
