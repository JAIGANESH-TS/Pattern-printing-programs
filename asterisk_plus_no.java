import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int no=1;
HashMap<Integer,String> hm=new HashMap<>();
for(int i=1;i<=n;i++)
{
    String t="";
    for(int j=1;j<=i;j++)
    {
        t+=no++;
        if(j!=i)
        t+="*";
    }
    hm.put(i,t);
    System.out.println(t);
}
for(int i=n;i>=1;i--)
{
    System.out.println(hm.get(i));
}
	}
}
