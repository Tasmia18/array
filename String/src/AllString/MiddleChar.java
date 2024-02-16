package AllString;

import java.util.Scanner;

public class MiddleChar {
      static String getmiddlechars(String s)
      {
    	  int n=s.length();
    	  String st=s.charAt(n/2-1)+ ""+s.charAt(n/2);
    	 
    	  return st;
      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	 String mid=MiddleChar.getmiddlechars(s);
		System.out.println(mid);
				

	}

}
