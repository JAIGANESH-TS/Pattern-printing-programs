import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
String s=in.next();
int l=(s.length()+1)/2;
char arr[][]=new char[l][l*2];
for(char t[]:arr)
Arrays.fill(t,'*');
int ind=0;int er=l-1;
for(int i=0;i<l;i++)
{
arr[i][i]=s.charAt(ind++);arr[er][i]=s.charAt(ind-1);
er--;
}int sc=(s.length()+1)/2;
er=l-2;
for(int i=1;i<l;i++)
{
    arr[i][sc++]=s.charAt(ind++);
    arr[er--][sc-1]=s.charAt(ind-1);
}
for(int i=0;i<l;i++)
{
    for(int j=0;j<l*2-1;j++)
    System.out.print(arr[i][j]);
    System.out.println();
}

	}
}
