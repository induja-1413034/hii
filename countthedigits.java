package guviprgms;

import java.util.Scanner;

public class countthedigits {

	public static void main(String[] args) {
		int a,count=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a>0){
			int temp=a%10;
			count++;
			a=a/10;
		}
		System.out.println(count);

	}

}
