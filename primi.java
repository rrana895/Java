package lesson1;

	import java.util.*;
	import java.io.*;

	public class primi {
	    public static void main(String []argh)
	    {
	        Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
	                //Complete the code
	                
	                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
	                System.out.println("* short");
	                
	                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
	                System.out.println("* int");
	                
	                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
	                System.out.println("* long");
	                
	                
	                //if(x>=-32768 && x<=32767)System.out.println("* short");
	                //if(x>=-2e31 && x<=2e31-1)System.out.println("* int");
	                //if(x>=-2e63 && x<=2e63-1)System.out.println("* long");
	                
	                
			}
				
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }
	    }
	}




