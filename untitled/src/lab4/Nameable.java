package lab4;

public interface Nameable {
    String getName();
}

class World implements Nameable{
    String name;
    int radius;
    int year;
    World(String name, int radius, int year){
        this.name = name;
        this.radius = radius;
        this.year = year;
    }
    public void print() {
        System.out.printf("Планета '%s' (радиус %s) ее возраст %d лет \n",
                name, radius, year);
    }
    @Override
    public String getName() {
        return name;
    }
}

class Journal implements Nameable {
    private final String name;
    Journal(String name){
        this.name = name;
    }
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }
    @Override
    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        World a1 = new World("Pluto",5900,460000000);
        World a2 = new World("Earth",6371,454000000);
        World a3 = new World("Jupiter",71400,49000000);
        Journal a4 = new Journal("Winner");
        System.out.println(a1.getName());
        System.out.println(a2.getName());
        System.out.println(a3.getName());
        System.out.println(a4.getName());

    }

}
