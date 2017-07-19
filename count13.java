package GuviLogic;

import java.util.Scanner;

public class count13 {
public static void main(String[] args){
	int a,b,c,sum=0;
	Scanner s=new Scanner(System.in);
			a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if(a!=13&&b!=13&&c!=13){
		System.out.println(a+b+c);
	}
	else if(a==13&&b==13&&c==13||a==13){
		System.out.println(0);
	}
	else if(b==13){
		System.out.println(a);
	}
	else{
		System.out.print(a+b);
	}
}
}
