package GuviLogic;

import java.util.Scanner;

public class averagechar {
public static void main(String[] args){
	String a;
	int b,sum=0;
	Scanner s=new Scanner(System.in);
	a=s.next();
	for(int i=0;i<a.length();i++){
		b=(int)a.charAt(i);
		sum=sum+b;
		//System.out.println(b);
	}
	double avg=sum/a.length();
	System.out.println((char)avg);
}
}
