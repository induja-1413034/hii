package guviprgms;

import java.util.Arrays;
import java.util.Scanner;

public class maximumarray {
	public static void main(String[] args){
		int[] array=new int[25];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<25;i++){
			array[i]=s.nextInt();
		}
		Arrays.sort(array);
		int max=array[24];
		System.out.println("The maximum element in the array"+max);
	}
}
