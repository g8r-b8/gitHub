#include <stdio.h>

int main(){

	int x = 7;
	printf("x=%d\n",x);


	x = 9;
	printf("x=%d\n",x);

	int *aptr = &x;
	printf("A ptr is: %d\n", *aptr);

	*aptr = 21;
	printf("A ptr is: %d\n", *aptr);
}
