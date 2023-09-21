package interviewprograms;

import java.util.Arrays;

public class RearrangeString {
	public static void main(String[]args) {
    String a = "abfdc";
    char[] b = a.toCharArray();
    
    Arrays.sort(b);
    
    for(int i =0; i<b.length; i++) {
    	System.out.println(b[i]);
    }
	}
}
