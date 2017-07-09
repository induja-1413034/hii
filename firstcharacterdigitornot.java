package guviprgms;

import java.util.Scanner;

public class firstcharacterdigitornot {
public static void main(String[] args){
	String a;
	boolean b=true;
	boolean c=false;
	Scanner s=new Scanner(System.in);
	a=s.next();
	if(a.charAt(0)>='0'&&a.charAt(0)<='9'){
		System.out.println(b);
	}
	else{
		System.out.println(c);
	}
}
}
