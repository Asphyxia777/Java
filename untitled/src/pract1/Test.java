package pract1;

public class Test {
    public static void main (String[] args)
    {
        Ball b1 = new Ball("Yellow",15,"Volleyball");
        Ball b2 = new Ball("Red",20);
        b2.setGame("Football");
        System.out.println(b1);
        System.out.println(b1.output());
        System.out.println(b2.output());
    }
}
