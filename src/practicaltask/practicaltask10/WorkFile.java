package practicaltask.practicaltask10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WorkFile {

	public static void main(String[] args) {
		ArrayList<String> arrStr = new ArrayList<>();
		try {
			FileInputStream fstream = new FileInputStream("D:/file.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			int ch;
			String str;

			try {
				while ((ch = br.read()) != -1){
				    str = String.valueOf((char)ch); 
					arrStr.add(str);
				   }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (String item: arrStr) {
			System.out.println(item);
		}
		System.out.println(arrStr.size());
	}

}
