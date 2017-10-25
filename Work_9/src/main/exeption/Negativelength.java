package main.exeption;

public class Negativelength extends Exception{

	private static final long serialVersionUID = 1L;

	public Negativelength(String message){
		super(message);
	}
	
	public Negativelength(){}
	
}
