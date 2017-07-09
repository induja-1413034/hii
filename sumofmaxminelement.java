package guviprgms;

import java.util.Arrays;
import java.util.Scanner;

public class sumofmaxminelement {
public static void main(String[] args){
	int[] array=new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++){
		array[i]=s.nextInt();
	}
	Arrays.sort(array);
	int max=array[4];
	int min=array[0];
	int sum=max+min;
	System.out.println("The maximum element in the array is"+max);
	System.out.println("The minimum element in the array is"+min);
	System.out.println("The sum of maximum and minimum element in the array is"+sum);
	
}
}
