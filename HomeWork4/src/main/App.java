package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.met.Methods;

public class App {

	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		Methods m = new Methods();
//		m.rangeCheck(sc);
//		m.minmax(sc);
//		m.HTTP_Error(sc);
		m.Dogs(sc);
	}

}
