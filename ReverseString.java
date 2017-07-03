package GuviPrgms;
import java.util.Scanner;
public class ReverseString {
public static void main(String[] args){
	String a;
	Scanner s=new Scanner(System.in);
	a=s.next();
	for(int i=a.length()-1;i>=0;i--){
		System.out.println(a.charAt(i));
	}
}
}
