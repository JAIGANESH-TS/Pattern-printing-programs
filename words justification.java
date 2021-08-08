import java.util.*;
public class Justification {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
String s=in.nextLine();
String arr[]=s.split(" ");
int len=0;
for(String ss:arr)
len=Math.max(len,ss.length());
char mat[][]=new char[len][arr.length];
for(char a[]:mat)
Arrays.fill(a,'*');
for(int j=0;j<arr.length;j++)
{
if(j%2==0)
{
    for(int i=0;i<Math.min(arr[j].length(),len);i++)
    mat[i][j]=arr[j].charAt(i);
}
else
{
    int ind=0;
    for(int i=len-arr[j].length();i<len && ind<arr[j].length();i++,ind++)
    mat[i][j]=arr[j].charAt(ind);
}
}
//System.out.println(len);
for(int i=0;i<len;i++)
{
    for(int j=0;j<arr.length;j++)
    System.out.print(mat[i][j]);
    System.out.println();
}
	}
}
