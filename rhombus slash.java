/*
Input: 5
Output:

####/\####
###/##\###
##/#/\#\##
#/#/##\#\#
/#/#/\#\#\
\#\#\/#/#/
#\#\##/#/#
##\#\/#/##
###\##/###
####\/####

*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
char mat[][]=new char[n*2][n*2];
for(int i=0;i<n*2;i++)
{
  for(int j=0;j<n*2;j++)
  mat[i][j]='#';
}
mat[0][n-1]='/';
mat[0][n]='\\';
for(int i=1;i<n;i++)
{
  if(i%2==0)
  {
    mat[i][n-1]='/';
    mat[i][n]='\\';
  }
  for(int j=0;j<n*2;j++)
  {
    if(j<n&& mat[i-1][j+1]=='/')
    mat[i][j]='/';
    if(j>n && mat[i-1][j-1]=='\\')
    mat[i][j]='\\';
  }
}
mat[n*2-1][n-1]='\\';mat[n*2-1][n]='/';
for(int i=n*2-2;i>=n;i--)
{
  if(i%2==1)
  {
  mat[i][n-1]='\\';mat[i][n]='/';
  }
  for(int j=0;j<n*2;j++)
  {
    if(j<n && mat[i+1][j+1]=='\\')
    mat[i][j]='\\';
    if(j>n && mat[i+1][j-1]=='/')
    mat[i][j]='/';
  }
}
for(int i=0;i<n*2;i++)
{
  for(int j=0;j<n*2;j++)
  System.out.print(mat[i][j]);
  System.out.println();
}
	}
}
