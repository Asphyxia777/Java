package pract5;

public class First {
    public static void func (int n,int k)
    {
        if (k<=n)
        {
            for (int i = 0;i<k;i++)
            {
                System.out.print(k+" ");
            }
            func(n,k+1);
        }
    }
    public static void main (String[] args)
    {
        func(4,1);
    }
}