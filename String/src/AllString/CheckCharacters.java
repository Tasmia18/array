package AllString;

import java.util.Scanner;

public class CheckCharacters {
	 static String validatecharacter(String st)
     {
		 int n=st.length();
		 for(int i=0;i<n;i++)
		 {
			 if(st.charAt(0)==st.charAt(n-1))
			 {
				 return "valid";
			 }
			 else
				 return "invalid";
		 }
		 
   	  
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
	 String result=CheckCharacters.validatecharacter(st);
     System.out.println(result);
	}
	
}
