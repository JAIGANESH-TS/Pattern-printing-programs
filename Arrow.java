import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner in=new Scanner(System.in);
int n=in.nextInt();
HashMap<Integer,ArrayList<String>> hm=new HashMap<>();
for(int i=1;i<=n;i++)
{
    hm.put(i,new ArrayList<String>());
    int j=n-i;
    String mm="- ".repeat(j);
    hm.get(i).add(mm);
}
int no=1;
for(int i=n;i>=1;i--)
{
    ArrayList<String> ka=hm.get(i);
    for(int j=1;j<=i;j++)
    ka.add((no++)+" ");
}
for(int i=1;i<=n;i++)
{
    ArrayList<String> ka=hm.get(i);
    for(int j=1;j<=i;j++)
    ka.add((no++)+" ");
}
for(int i=1;i<=n;i++)
{
    ArrayList<String> k=hm.get(i);
    for(String q:k)
    System.out.print(q);
    System.out.println();
}
	}
}
