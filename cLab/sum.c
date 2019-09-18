#include<stdio.h>
int main()
{
   int a, b, c, i;
   printf("Enter two numbers to add, separated by a space: ");
   scanf("%d%d",&a,&b);
   c = a + b;
   i = 0;
   printf("The sum of equals %d\n",c);
   while(i<5){
		printf("%d\n", i);
		i++;
   }

   return 0;
}
