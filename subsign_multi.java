import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int t=0;
System.out.println("*");
int co=1;
for(int i=2;i<=n;i++)
{t=0;
    for(int j=1;j<=i;j++)
    {
    ArrayList<Character> al=new ArrayList<>();
    for(int k=0;k<co;k++)
    al.add('-');
    for(int k=0;k<i;k++)
    al.add('*');
    for(char ch:al)
    System.out.print(ch+" ");
    System.out.println();
    t=al.size();
    }
    co=t;
}
	}
}
