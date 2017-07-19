package GuviLogic;

import java.util.Arrays;
import java.util.Scanner;

public class secndsmallest {
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] array=new int[n];
		int i;
		for(i=0;i<array.length;i++){
		array[i]=s.nextInt();
		}
		for(i=0;i<array.length;i++){
		Arrays.sort(array);
		}
		int max=array[n-2];
		System.out.println("The maximum element in the array"+max);
		}
}
