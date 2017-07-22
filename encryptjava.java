package Strings;

import java.util.Scanner;

public class encryptjava {
public static void main(String[] args){
	String a;
	Scanner s=new Scanner(System.in);
	a=s.next();
	for(int i=0;i<a.length()-1;i++){
		int b=a.charAt(i)-1;
		if(a.charAt(i)=='a'||a.charAt(i)=='A'){
			System.out.print("z");
		}
		else{
		System.out.print(Character.valueOf((char) b));
	}
	}
	System.out.print(a.substring(a.length()-1));
}
}
