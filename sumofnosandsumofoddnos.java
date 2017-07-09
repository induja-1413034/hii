package guviprgms;

public class sumofnosandsumofoddnos {
public static void main(String[] args){
	int sum=0;
	int sum1=0;
	for(int i=0;i<=15;i++){
		sum=sum+i;
	}
	System.out.println("The sum of numbers is"+sum);
	for(int j=15;j<=45;j++){
		if(j%2!=0){
			sum1=sum1+j;
		}
	}
	System.out.println("The sum of odd numbers is"+sum1);
}
}
