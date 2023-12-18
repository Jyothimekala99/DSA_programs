public class patterns
 {
    public static void pattern1()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

    public static void pattern2()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void pattern3()
    {
        int n=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void pattern4() {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void pattern5()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }




    public static void pattern6()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }




    public static void pattern7()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                char ch=(char)('A'+i-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }




    public static void pattern8()
        {
            int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    char ch=(char)('A'+j-1);
                    System.out.print(ch);
                }
                System.out.println();
            }
        }



    public static void pattern9()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(((i+j)&1)==0)
                {
                    System.out.print(1);

                }
                else
                {
                    System.out.print(0);
                        
                }
            }
                System.out.println();
        }
    }



    public static void pattern10()
    {
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k++);
            }
            System.out.println();
        }
    }



    public static void pattern11()
    {
        int n=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }



    public static void pattern12()
     {
        int n = 5;

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            for (int k=1;k<=2*i-1;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
        pattern12();
    }

}
