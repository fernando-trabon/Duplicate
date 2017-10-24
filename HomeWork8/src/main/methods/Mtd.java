package main.methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mtd {
	
	public String longestWord(String sentence) {
		String [] words = wordssplit(sentence);

		
		
		int max = words[0].length();
		String maxw = words[0];
		
		
		for (String word : words) {
			if (word.length()>max) {
				max = word.length();
				maxw = word;
			}
		}
		
		return maxw;
	}
	
	public int numbersOfletters(String word) {
		return word.length();
	}
	
	public String secondreversed(String sentence) {
		String [] words = wordssplit(sentence);
		StringBuilder ret = new StringBuilder(words[1]);
		
		return ret.reverse().toString();
	}
	
	private String[] wordssplit(String sentence) {
		String [] words = sentence.split(" ");
		StringBuffer tmp = new StringBuffer();
		
		for (int i=0; i<words.length; i++) {
			if (words[i].contains(".")) {
				tmp.delete(0, tmp.length());
				tmp.append(words[i]);
				tmp.deleteCharAt(words[i].indexOf("."));
				words[i] = tmp.toString();
			}else {
				if (words[i].contains(",")) {
					tmp.delete(0, tmp.length());
					tmp.append(words[i]);
					tmp.deleteCharAt(words[i].indexOf(","));
					words[i] = tmp.toString();
				}
			}
				
			
		}
		
		return words;
	}

	public String spacesconverter(String sentence) {
		StringBuffer tmp = new StringBuffer(); 
		String pattern = "\\w+";
	    Pattern p = Pattern.compile(pattern);
	    Matcher m = p.matcher(sentence);
	    while (m.find()) {
	        tmp.append(sentence.substring(m.start(), m.end()) + " ");

	    }
	    tmp.deleteCharAt(tmp.length()-1);
	    return tmp.toString()+".";
	}

	public void moneyMade(String sentence) {
		String pattern = "\\$(\\d*)(\\.\\d{2})?";
	    Pattern p = Pattern.compile(pattern);
	    Matcher m = p.matcher(sentence);
	    while (m.find()) {
	    	System.out.println(sentence.substring(m.start(), m.end()));
	    }
	}
}
