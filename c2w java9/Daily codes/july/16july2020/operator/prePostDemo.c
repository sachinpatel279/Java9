

#include<stdio.h>


void main(){

	int num=10;
	int ans=0;

	ans= ++num + ++num;

	printf("%d\n",ans);	//24
	printf("%d\n",num);	//12

}
