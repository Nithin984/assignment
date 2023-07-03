package java_Assignment;

import java.util.Scanner;

public class question_01 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	if(num>=0) {
		if(num==0) {
			System.out.println("Number is zero");
		}
		else {
		System.out.println("Positive number");
		}
	}
	else{
		System.out.println("Negative number");
	}
	
	
}
}
