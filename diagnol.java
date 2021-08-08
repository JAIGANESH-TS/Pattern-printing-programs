import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        int no=in.nextInt();
        if(i==j  || i+j==n-1)
        System.out.print("* ");
        else
        System.out.print(no+" ");
    }
    System.out.println();
}
	}
}
