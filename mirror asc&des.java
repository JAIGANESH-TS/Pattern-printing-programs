import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();int no=1;
ArrayList<String> al=new ArrayList<>();
for(int i=0;i<n;i++)
{
    String str="";
    for(int j=0;j<=i;j++)
    str+=no++;
    System.out.println(str);
}
no--;
for(int i=n-1;i>-1;i--)
{
    String str="";
    for(int j=0;j<=i;j++)
    str+=no--;
    System.out.println(str);
}
	}
}
