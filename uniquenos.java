package LogicPrograms;

import java.util.Scanner;

public class uniquenos {
public static void main(String[] args){
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
					a[i]=0;
					a[j]=0;// duplicate elements wont display
			}
		}
	}
	for(int i=0;i<n;i++){
		if(a[i]!=0){
			System.out.println(a[i]);
		}
	}
}
}
