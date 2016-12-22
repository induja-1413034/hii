#include<Stdio.h>
#include<conio.h>
void main()
{
int i,a,b,c;
printf("\nEnter the table no:");
scanf("%d",&a);
printf("\nEnter the limit:");
scanf("%d",&b);
for(i=1;i<=b;i++)
{
c=a*i;
printf("\n%d*%d=%d",a,i,c);
}
getch();
}
