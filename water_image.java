import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int a=in.nextInt(),b=in.nextInt();
ArrayList<String> al=new ArrayList<>();
for(int i=1;i<=b;i++)
{
    String k="";
    for(int j=1;j<=i;j++)
    k+=a;
    System.out.println(k);
    a++;
    al.add(k);
}
for(int i=al.size()-1;i>=0;i--)
{
    System.out.println(al.get(i));
}
	}
}
