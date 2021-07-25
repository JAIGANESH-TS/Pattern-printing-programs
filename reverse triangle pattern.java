import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int no=1;
for(int i=0;i<n;i++)
{
    for(int j=0;j<n-i-1;j++)
    System.out.print("*");
    for(int j=no;j>=1;j--)
    System.out.print(j);
    no++;
    System.out.println();
}
	}
}
