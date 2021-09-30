import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    char mat[][]=new char[1000][1000];
    for(char a[]:mat)
    Arrays.fill(a,' ');
    int lower=c;
    if(lower<r)
    lower=r-lower;
    else
    lower=0;
    int start=lower;
    int end=start+c*2-2;
    //System.out.println(start+" "+end);
    //System.out.println(start+" "+end);
    int lastrow=Math.max(r,c)-1;
    while(start<=end)
    {
        int l=start;
        int h=end;
        while(l<=h)
        {
        //    System.out.print(l+" "+h);
            mat[lastrow][l]='#';
            if(l==h)
            break;
            mat[lastrow][h]='#';
            l+=2;
            h-=2;
        }
        //System.out.println();
        lastrow--;
        start++;
        end--;
    }
    int min=Math.min(r,c);
    if(min==r)
    {
        min=c-min;
    }
    else
    min=0;
    start=min;
    end=start+r*2-2;
    int ll=r;
    int ss=0;
    for(int l=1;l<=r;l++)
    {
        int ee=start;
        for(int dk=0;dk<ll;dk++)
        {
            mat[ss][ee]='*';
            ee+=2;
        }
        ss++;
        ll--;
        start++;
    }
    for(int i=0;i<Math.max(r,c);i++)
    {
        boolean b=false;
        for(int j=0;j<300;j++)
        {
        if(mat[i][j]!=' ')
        b=true;
        if(b==false)
        System.out.print("-");
        else
        System.out.print(mat[i][j]);
        }
        System.out.println();
    }
	}
}
