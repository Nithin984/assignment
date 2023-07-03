package java_Assignment;

import java.util.Scanner;

public class question_02 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int[] a=new int[num];
if(num>0) {
	a[0]=0;
a[1]=1;
}
for(int i=0;i<num;i++) {
	if(i>1) {
a[i]=a[i-1]+a[i-2];
	}
System.out.print(a[i]+" ");
}
}
}
