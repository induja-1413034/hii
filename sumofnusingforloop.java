package guviprgms;

import java.util.Scanner;

public class sumofnusingforloop {
public static void main(String[] args){
	int a,sum=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	for(int i=0;i<=a;i++){
		sum=sum+i;
	}
	System.out.println(sum);
}
}
