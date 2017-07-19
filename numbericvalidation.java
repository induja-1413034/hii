package GuviLogic;

import java.util.Scanner;

public class numbericvalidation {
public static void main(String[] args){
	String a,z="";
	String b="true";
	String c="false";
	Scanner s=new Scanner(System.in);
	a=s.next();
	for(int i=0;i<a.length();i++){
	if(a.contains("0")||a.contains("1")||a.contains("2")||a.contains("3")||a.contains("4")||a.contains("5")||a.contains("6")||a.contains("7")||a.contains("8")||a.contains("9")){
		z=b;
	}
	else{
		z=b;
	}
	}
	System.out.println(z);
}
}