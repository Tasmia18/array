package Array11;

import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		String s[]=new String[5];
		Scanner sc=new Scanner(System.in);
//		s[0]="t";
//		s[1]="s";
//		s[2]="f";
//		s[3]="d";
//		s[4]="m";
		
		for(int i=0;i<5;i++) {
			s[i]=sc.next();
			
		
for(int j=0;j<5;j++) {
	System.out.println("print all student name: "+ s[j]);
}
	}

	}
}
