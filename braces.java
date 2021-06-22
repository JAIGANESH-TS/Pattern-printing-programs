import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
String s=in.next();
char ch1=s.charAt(0);
char ch2=s.charAt(s.length()-1);
int no=Integer.valueOf(s.substring(1,s.length()-1));
for(int i=1;i<=no;i++)
{
    for(int j=i;j>=1;j--)
    print(j,ch1,ch2);
    System.out.println();
}
	}
	public static void print(int k,char c1,char c2)
	{
	    for(int i=0;i<k;i++)
	    System.out.print(c1);
	    for(int i=0;i<k;i++)
	    System.out.print(c2);
	}
}