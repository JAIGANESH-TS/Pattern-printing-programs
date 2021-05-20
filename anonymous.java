import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int r=s.nextInt();
	    int c=s.nextInt();
	    int co=1;
	    for(int i=1;i<=c-r;i++)
	    {
	      int t=1;
	      int k=r;
	      while(t<=co)
	      {
	        System.out.print(r);t++;k++;
	      }co++;
	      while(k<=c-1)
	      {
	        System.out.print(k++);
	      }
	      System.out.println(c);
	    }
	    int diff=c-r-1;//System.out.println(diff);
	    int l=c-2;
	    int w=2;
	    while(diff-->0)
	    {
	     for(int i=r;i<=l;i++)
	    {
	      System.out.print(i);
	    }l--;
	    for(int s1=1;s1<=w;s1++)
	    {
	      System.out.print(c);
	    }w++;
	      System.out.println();
	    }
	}
}