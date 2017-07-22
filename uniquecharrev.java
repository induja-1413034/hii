package GuviLogic;

import java.util.Scanner;

public class uniquecharrev {
	public static void main(String[] args){
		String a;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(a.charAt(i)==a.charAt(j)){
					b[i]='\0';
					//b[j]='\0';
				}
			}
		}
		String z="";
		for(int i=b.length-1;i>=0;i--){
			if(b[i]!='\0'){
				z=String.valueOf(b[i]);
				System.out.print(z);
			}
	}
	}
	}

