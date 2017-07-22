package GuviLogic;

import java.util.Scanner;

public class specifictarget {
public static void main(String[] args){
	int n,sum=0,sum1=0;
	System.out.println("Enter the array size:");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int target;
	target=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]+a[j]==target){
			sum=a[i];
			sum1=a[j];
			}
		}
	}
	if(target==sum+sum1){
	System.out.println("true");
	}
	else{
		System.out.println("false");
	}
}
}
