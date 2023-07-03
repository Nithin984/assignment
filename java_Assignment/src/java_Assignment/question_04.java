package java_Assignment;

import java.util.Scanner;

public class question_04 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
		System.out.println("Enter teh third number");
		int c=s.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}

		}
	}
}
