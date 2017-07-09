package guviprgms;

import java.util.Scanner;

public class swappingwithouttemporaryvariable {
public static void main(String[] args){
	int a,b;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("The swapping of a and b is"+a+" "+b);
	
}
}
