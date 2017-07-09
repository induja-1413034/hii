package guviprgms;

import java.util.Scanner;

public class secondcharacter {
public static void main(String[] args){
	String a;
	String b;
	Scanner s=new Scanner(System.in);
	a=s.next();
	b=a.substring(0,1)+(a.toUpperCase().substring(1,2))+a.substring(2,a.length());
	System.out.println(b);
}
}
