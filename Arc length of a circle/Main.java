#include <stdio.h>
#define PI 3.14
int main()
{
   float r,angle;
  scanf("%f%f",&r,&angle);
  float length=PI*r*angle/180;
  printf("%.2f",length);
   return 0;
}