package Strings;

import java.util.Scanner;

public class mostfreqchar {
	public static void main(String[] args){
		String a;
		int c=0,e=0;
		Scanner s=new Scanner(System.in);
		a=s.next();
		int[] count=new int[26];
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++){
			c=(char)b[i];
			if(c>=97&&c<=122){
				count[c-97]++;
			}
		}
		for(int j=0;j<26;j++){
			if(count[j]!=0){
				System.out.print((char)(j+97)+""+count[j]);
			}
		}
		/*for(int i=0;i<26;i++){
			if(count[i]>(c-97)){
				int d=c-97;
				d=count[i];
				e=i;
				}
		}
		System.out.println("The most frequent character is"+(char)(e+97));*/
	}
	
}
