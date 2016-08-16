#include<stdio.h>
int main()
{
int n,a[n],i,j,sum=0;

printf("Enter the number of values");
scanf("%d",&n);
printf("Enter the values");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
for(j=0;j<n;j++)
{
sum=sum+a[j];
}

sum=sum/n;

printf("average array value is  %d",sum);
return 0;
}
