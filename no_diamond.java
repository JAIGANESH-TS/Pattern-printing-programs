import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
String mat[][]=new String[n*2+1][n*2+1];
for(String a[]:mat)
Arrays.fill(a,"*");
int j=n,l=n,h=n;
int lh=1;
for(int i=0;i<n;i++)
{
    int no=0;
    int t=1;
   // int lh=1;
    for(int m=l;m<=h;m++)
    {
        if(t<=lh)
        mat[i][m]=(no++)+"";
        else
        mat[i][m]=(--no)+"";
        if(t==lh)
        no--;
        t++;
    }
    lh++;
    l--;
    h++;
}
l=0;h=n*2;
int mmm=1+n;
for(int i=n;i<mat.length;i++)
{
    int no1=0;
    int t=1;
    for(int m=l;m<=h;m++)
    {
        if(t<=mmm)
        mat[i][m]=(no1++)+"";
        else
        mat[i][m]=(--no1)+"";
        if(t==mmm)
        no1--;
        t++;
    }
    l++;h--;
    mmm--;
}
System.out.println();
for(int i=0;i<mat.length;i++)
{
    for(j=0;j<mat[0].length;j++)
    System.out.print(mat[i][j]+" ");
    System.out.println();
}
	}
}
