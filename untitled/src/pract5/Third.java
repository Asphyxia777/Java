package pract5;

public class Third {
    public static void loop(int a, int b) {
        if (a < b) {
            if (a != b) {
                System.out.print(a+" ");
                loop(a + 1, b);
            }
        }
        if (a > b) {
            if (a != b) {
                System.out.print(a+" ");
                loop(a - 1, b);
            }
        }
        if (a==b)
        {
            System.out.print(b);
        }
    }
    public static void main (String[] args)
    {
        loop (15,1);
    }
}
