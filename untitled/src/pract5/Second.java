package pract5;

public class Second {
    public static void loop(int n)
    {
        if (n!=0)
        {
            System.out.print(n+" ");
            loop(n-1);
        }
    }
    public static void main(String[] args)
    {
        loop(15);
    }
}