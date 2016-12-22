#include<Stdio.h>
#include<Conio.h>
void main()
{
int sum,a,b,*p,*q;
printf("\nEnter the number:");
scanf("%d%d",&a,&b);
p=&a;
q=&b;
sum=*p+*q;
printf("%d",sum);
getch();
}
