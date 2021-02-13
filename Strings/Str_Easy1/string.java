package str;

import java.io.*;
import java.util.*;

public class string {
	
public static void main(String[] args){
	    
		Scanner sc=new Scanner(System.in);
		String A=sc.next("hello");
		String B=sc.next("java");
	     //Enter your code here. Print output to STDOUT. 
	       
		System.out.println(A.length() + B.length()); // length of java string is same as the unicode code units of the string.
	        
	        // alphabetically/lexicographically 
	        
		int c = A.compareToIgnoreCase(B);
	        
		if(c < 0) {
	        System.out.println("No"); //A comes alphabetically first
	        }
	    else {
	        System.out.println("Yes"); //B comes alphabetically first
	        }
	       
	     A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
	     B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
	     System.out.println(A + " "+ B); 
	        
	    }
	    
	}

