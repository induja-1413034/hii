package guviprgms;

import java.util.Scanner;

public class celciustofarenheit {
public static void main(String[] args){
	int a;
	float b;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=(float) (a*1.8+32);
	System.out.println(b);
	
}
}
