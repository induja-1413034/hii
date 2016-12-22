#include<Stdio.h>
#include<conio.h>
void main()
{
int n,rm,rn=0;
printf("\nEnter the number:");
scanf("%d",&n);
while(n!=0)
{
    rm=n%10;
rn=rn*10+rm;
n=n/10;
}
printf("%d",rn);
getch();
}
