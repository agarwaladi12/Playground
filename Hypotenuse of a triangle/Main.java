#include<stdio.h>
#include<math.h>
int main()
{
  float adj,opp,hypo;
  scanf("%f%f",&opp,&adj);
  hypo=pow((pow(adj,2)+pow(opp,2)),0.5);
    printf("%.2f",hypo);
  return 0;
}