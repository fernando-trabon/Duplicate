package main.met;

import main.exeption.Negativelength;

public class Mtds {

	public int squareRectangle(int a, int b) throws Negativelength{
		if ((a>0)&&(b>0)){
			return a*b;
		}else{
			throw new Negativelength("One of inputed values is below zero!");
		}
	}
}
