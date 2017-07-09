package guviprgms;

import java.util.Scanner;

public class reversenumber {
public static void main(String[] args){
	int a,count=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	while(a>0){
		int temp=a%10;
		a=a/10;
		System.out.print(temp);
	}

}
}
