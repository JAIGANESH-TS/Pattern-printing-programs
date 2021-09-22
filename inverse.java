    public static void printPattern(int N) {
        for(int i=N;i>=2;i--)
        {
            for(int j=i;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
    }
