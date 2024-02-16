package AllString;

import java.util.Scanner;

public class SumOfDigits {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int result=SumOfDigits.getdigits(s);
		System.out.println(result);
				

	}

}
