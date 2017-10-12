package main.met;

import java.io.BufferedReader;
import java.io.IOException;

import main.add.Dog;

public class Methods {
	public void rangeCheck(BufferedReader br) throws IOException{
		System.out.println("------------------------------------------");
		
		System.out.println("Checking if numbers belong ro[-5,5]");
		System.out.println("Enter first number:");
		float n1 = Float.parseFloat(br.readLine());
		
		System.out.println("Enter second number:");
		float n2 = Float.parseFloat(br.readLine());
		
		System.out.println("Enter third number:");
		float n3 = Float.parseFloat(br.readLine());
		
		System.out.println("First belong? "+belong(n1));
		System.out.println("Second belong? "+belong(n2));
		System.out.println("Third belong? "+belong(n3));
		
		System.out.println("------------------------------------------");
	}
	
	public  String belong(float a) {
		
		return (a>=-5)&&(a<=5)? "Yes" : "No";
	}
	
	public int max(int a, int b, int c) {
		if (a>b) {
			if (a>c) {
				return a;
			}else {
				return c;
			}
		}else {
			if (b>c) {
				return b;
			}else {
				return c;
			}
		}
		
	}
	
	public int min(int a, int b, int c) {
		if (a<b) {
			if (a<c) {
				return a;
			}else {
				return c;
			}
		}else {
			if (b<c) {
				return b;
			}else {
				return c;
			}
		}
		
	}
	
	public void minmax(BufferedReader br) throws IOException{
		System.out.println("------------------------------------------");
		
		System.out.println("Finding min and max of 3 numbers");
		System.out.println("Enter first number:");
		int n1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter second number:");
		int n2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter third number:");
		int n3 = Integer.parseInt(br.readLine());
		
		System.out.println("Max: " + max(n1, n2, n3));
		System.out.println("Min: " + min(n1, n2, n3));
		
		System.out.println("------------------------------------------");
	}
	
	public enum Err{
		Bad_Request, Unauthorized, Payment_Required, Forbidden, Not_Found, Method_Not_Allowed,
		Not_Acceptable, Proxy_Authentication_Required, Request_Timeout, Conflict, Gone, Length_Required,
		Precondition_Failed, Request_Entity_Too_Large, Request_URI_Too_Long, Unknown_error
		}
	
	public void HTTP_Error(BufferedReader sc) throws IOException {
		
		Err error;
		
		System.out.println("------------------------------------------");
		System.out.println("Enter HTTP error number");
		
		switch (Integer.parseInt(sc.readLine())) 
		  { 
		       case 400 : 
				error = Err.Bad_Request; 
				break; 
		       case 401 : 
					error = Err.Unauthorized; 
					break;
		       case 402 : 
					error = Err.Payment_Required; 
					break;
		       case 403 : 
					error = Err.Forbidden; 
					break;
		       case 404 : 
					error = Err.Not_Found; 
					break;
		       case 405 : 
					error = Err.Method_Not_Allowed; 
					break;
		       case 406 : 
					error = Err.Not_Acceptable; 
					break;
		       case 407 : 
					error = Err.Proxy_Authentication_Required; 
					break;
		       case 408 : 
					error = Err.Request_Timeout; 
					break;
		       case 409 : 
					error = Err.Conflict; 
					break;
		       case 410 : 
					error = Err.Gone;
					break;
		       case 411 : 
					error = Err.Length_Required; 
					break;
		       case 412 : 
					error = Err.Precondition_Failed; 
					break;
		       case 413 : 
					error = Err.Request_Entity_Too_Large; 
					break;
		       case 414 : 
					error = Err.Request_URI_Too_Long; 
					break;
				default : 
					error = Err.Unknown_error;
					break;
		  }
		System.out.println();
		System.out.println(error);
		System.out.println("------------------------------------------");

}
	
	public void Dogs(BufferedReader sc) throws NumberFormatException, IOException {
		System.out.println("------------------------------------------");
		
		System.out.println("First dog");
		Dog d1 = new Dog().input(sc);
		//d1.input(sc);
		System.out.println("Next one");
		Dog d2 = new Dog().input(sc);
		//d2.input(sc);
		System.out.println("Next one");
		Dog d3 = new Dog().input(sc);
		//d2.input(sc);
		
		System.out.println("Is here two or more dogs of same breed? " + samebreed(d1, d2, d3));
		System.out.println();
		oldestDog(d1, d2, d3);
		System.out.println("------------------------------------------");		
	}
	
	public String samebreed(Dog d1, Dog d2, Dog d3) {
		return ((d1.getBreed() == d2.getBreed())||(d1.getBreed() == d3.getBreed())||(d3.getBreed() == d2.getBreed()))? "Yes":"No";
	}
	
	public void oldestDog(Dog d1, Dog d2, Dog d3) { 
		System.out.println("Oldest one is"); 
		if (d1.getAge() == max(d1.getAge(), d2.getAge(), d3.getAge())) {
			  System.out.println("Name: "+d1.getName());
			  System.out.println("Breed: "+d1.getBreed());		
		}else {
			if (d2.getAge() == max(d1.getAge(), d2.getAge(), d3.getAge())) {
				  System.out.println("Name: "+d2.getName());
				  System.out.println("Breed: "+d2.getBreed());		
			}else {
				if (d3.getAge() == max(d1.getAge(), d2.getAge(), d3.getAge())) {
					  System.out.println("Name: "+d3.getName());
					  System.out.println("breed: "+d3.getBreed());		
				}
			}
		}
	}
}
