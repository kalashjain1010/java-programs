#include<stdio.h>
int main()
{
int pagenumber[10], y, k, pagefault, framenumber, j, n, frame[n];
y=0;
while(y<=9)
{
printf("Enter a number : ");
scanf("%d", &pagenumber[y]);
y++;
}
y=0;
while(y<=9)
{
printf("%d", pagenumber[y]);
y++;
}
return 0;
}