#include<stdio.h>
#include<stdlib.h>
void dfs(int no)
{
    while(no-->0)
    printf("*");
    return;
}
int main()
{
char s[1000];
scanf("%s",s);
int l=strlen(s);
int t=l/2;
int st=t;
for(int i=0;i<l/2+1;i++)
{
    dfs(i);
    for(int j=0;j<t;j++)
    printf("%c",s[j]);
    for(int j=st;j<l;j++)
    {
        printf("%c",s[j]);
    }
    dfs(i);
    t-=1;
    st++;
    printf("\n");
}
}
