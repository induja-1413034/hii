#include<Stdio.h>
#include<conio.h>
void main()
{
int n,a,temp,sum=0;
printf("\nEnter the no:");
scanf("%d",&n);
temp=n;
while(n!=0)
{
a=n%10;
n=n/10;
sum=sum+(a*a*a);
}
if(sum==temp)
    printf("\nIt is an armstrong number:");
    else
    printf("\nIt is not an armstrong number:");
getch();
}
