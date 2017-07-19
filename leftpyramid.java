package GuviLogic;

import java.util.Scanner;

public class leftpyramid {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
				for(int k=1;k<=i;k++)
				{
				System.out.print("*");
				}
			System.out.println("");
			}
		}

}

