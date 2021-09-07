import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
System.out.println(1);
int star=1;
int no=2;
for(int i=2;i<=2*n-1;i++)
{
    if(i==n)
    {
        int t=i+n-1;
        while(t>=n)
        System.out.print(t--);
        star=1;
        no=i+n;
        System.out.println();
    }
    else
    {
        System.out.print("*".repeat(star++));
        System.out.println(no++);
    }
}
//System.out.println("j");
	}
}
