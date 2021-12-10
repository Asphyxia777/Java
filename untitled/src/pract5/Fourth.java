package pract5;

public class Fourth {
    public static int loop(int n,int sum)
    {
        if (n>=1)
        {
            sum=sum+n%10;
            loop(n/10,sum);
        }
        if (n==0)
        {
            System.out.print(n);
            return sum;
        }
        return sum;
    }
    public static void main (String[] args)
    {
        System.out.println(loop(123,0));
    }
}
