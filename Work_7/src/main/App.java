package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) throws  IOException {
		List<Integer> myCollection = new ArrayList<Integer>();
		Random random = new Random();
		
		for (int i = 0; i<10; i++){
			myCollection.add(random.nextInt(30));
		}
		System.out.println(myCollection);
		System.out.println("---------------------------");
		
		List<Integer> newCollection = new LinkedList<Integer>();
		
		for (int i=0;i<myCollection.size();i++){
			if (myCollection.get(i)>5){
				newCollection.add(i);
			}
		}
		System.out.println(newCollection);
		System.out.println("---------------------------");
		
		for (int i=0; i<myCollection.size(); i++){
			if(myCollection.get(i)>20){
				myCollection.remove(i);
				i--;
			}
		}
		System.out.println(myCollection);
		System.out.println("---------------------------");
		
		myCollection.add(1,1);
		myCollection.add(7, -3);
		myCollection.add(4, -4);
		
		System.out.println(myCollection);
		System.out.println("---------------------------");
		for (int i = 0; i<myCollection.size(); i++){
			System.out.println("position - " + (i+1) + ", value of element - " + myCollection.get(i));
		}
	
		Collections.sort(myCollection);
		
		System.out.println("---------------------------");		
		System.out.println(myCollection);
		System.out.println("---------------------------");
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		for (int i=0; i<7; i++){
			employeeMap.put((i+1), Integer.toString((i+1)));
		}
		
		employeeMap.put(8, "1");
		System.out.println(employeeMap);
		System.out.println("---------------------------");
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Which ID are you interesting in?");
		int id = Integer.parseInt(sc.readLine());
		
		if(employeeMap.containsKey(id)){
			System.out.println("ID: " + id);
			System.out.println("Name: " + employeeMap.get(id));
		}
		
		System.out.println("---------------------------");		
		System.out.println("Which name are you interesting in?");
		String name = sc.readLine(); 
		
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()){
			if (entry.getValue().equals(name)){
				System.out.println("---------------------------");
				System.out.println("ID: " + entry.getKey());
				System.out.println("Name: " + entry.getValue());
			}
		}
		
		}

}
