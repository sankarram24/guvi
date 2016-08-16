#include <stdio.h>

int main()
{
    int a[6]={2,3,1,6,4,5};
    int i,j,k,swap,n=6;
    /*for(i=0;i<6;i++)
    {
    scanf("%d",&a[i]);
    
    }*/
    
    for(j=0;j<n;j++)
    {
        for(k=0;k<n-1;k++)
        {
            if(a[k]>a[k+1])
            {
                swap=a[k];
                a[k]=a[k+1];
                a[k+1]=swap;
                
            }
        }
    }
    
    printf("lowest valueis %d",a[0]);
    printf("highest value is %d",a[5]);
        return 0;
}

