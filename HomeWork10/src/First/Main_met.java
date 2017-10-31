package First;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import First.Threads.NewThread;

public class Main_met {

	public static void main(String[] args) {
//		 NewThread t1 = new NewThread("Message1");
//		 NewThread t2 = new NewThread("Message2");
//		 NewThread t3 = new NewThread("Message3");
//		
//		 t1.start();
//		 t2.start();
//		
//		 try {
//		 t1.join();
//		 t2.join();
//		 } catch (InterruptedException e) {}
//		
//		 t3.run();
//
//		 Thread t4 = new Thread() {
//		 public void run() {
//		 synchronized (Main_met.class) {
//		
//		 while(true) {
//		 System.out.println("Thread run");
//		 System.exit(0);
//		 }
//		 }
//		 }
//		 };
//		
//		
//		 t4.start();
//		
//		 if(t4.isAlive()) {
//		 System.out.println("Thread starting");
//		 }
//		 try {
//		 t4.join();
//		 } catch (InterruptedException e) {
//		
//		 }
//		 System.out.println("Last part");
//		 
//
//		Thread one = new Thread() {
//			public void run(){
//				
//				Thread two = new Thread() {
//					public void run() {
//						
//						for (int i=0; i<3; i++) {
//							System.out.println("Thread number two");
//						}
//						
//						Thread three = new Thread() {
//							public void run() {
//								for (int i=0; i<5; i++) {
//									System.out.println("Thread number three");
//								}
//							}
//						};
//						
//						three.start();
//					}
//				};
//				
//				two.start();
//			}
//		};
//		
//		one.start();		
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String fileNameIn="";
		String fileNameOut="";
		try {
			System.out.println("Enter path to file: file1.txt ");
			fileNameIn = sc.readLine();
			System.out.println("Enter path to file: file2.txt ");
		    fileNameOut =sc.readLine();
		} catch (IOException e) {
			System.err.println(e);
		}
		String s = null;
		List<String> lines = new ArrayList<String>();
		
		BufferedReader br=null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(fileNameIn+"file1.txt"));
			while ((s = br.readLine()) != null) {
				lines.add(s);
			}
			
			String maxline = "";
			int max = 0;
			
			for (String ss : lines) {
				if (ss.length()>max) {
					max = ss.length();
					maxline = ss;
				}
			}
			br.close();
			
			bw = new BufferedWriter(new FileWriter(fileNameOut+"file2.txt"));
			
			bw.write("Lines in the file" + fileNameIn+"file1.txt: " + lines.size());
			bw.newLine();
			bw.flush();;
			bw.write("Longest line of file"+fileNameIn+"file1.txt: " + maxline);
			bw.newLine();
			bw.flush();
			bw.write("Oleksii Demidov, 24.11.1995");
			bw.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	
		
		
	
	
	}
}
