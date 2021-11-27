package lab3;

public class DogTest {
    public static void main(String[] args) {
        Spitz s1 = new Spitz(2010, "Black", "High");
        System.out.println(s1.getBirth_date());
        System.out.println(s1.getVoice());
        System.out.println(s1.getColor());
        System.out.println("========================");
        Bulldog s2 = new Bulldog(2012, "White", "High", false);
        System.out.println(s2.getBirth_date());
        System.out.println(s2.getVoice());
        System.out.println(s2.getColor());
        s2.setCan_defend(true);
        System.out.println(s2.getCan_defend());
    };
}
