package guviprgms;

import java.util.Scanner;

public class decimaltobinary {
public static void main(String[] args){
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	String b=Integer.toBinaryString(a);
	int c=Integer.valueOf(b);
	System.out.println(c);
}
}
