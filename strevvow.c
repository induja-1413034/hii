#include<Stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char str[100];
int i,j,len;
printf("\nEnter the string:");
scanf("%s",&str);
len=strlen(str);
for(i=0;i<len;++i)
{
if(str[i]=='a'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='e'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
{
    for(j=i;j<len;j++)
    {

        str[j]=str[j+1];
    }
    len--;
}
}
printf("%s",str);
getch();
}
