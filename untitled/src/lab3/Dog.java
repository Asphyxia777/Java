package lab3;

abstract class Dog {
    protected String color;
    protected String voice;
    protected int birth_date;
    Dog() {this.birth_date = 0;
        this.color = "white";
        this.voice = "high";}
    Dog(int birth_date) {}
    Dog(int birth_date, String voice) {}
    Dog(int birth_date, String voice, String color) {}
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public int getBirth_date() {
        return birth_date;
    }
    public String getVoice() {
        return voice;
    }
    public String toString() {
        return "Dog{" + "color='" + color + '\'' + ", voice='" + voice + '\'' + ", birth_date=" + birth_date + '}';
    }

    public abstract boolean getCan_defend();
}

class Spitz extends Dog {
    public Spitz() {
        this.birth_date = 0;
        this.color = "white";
        this.voice = "high";
    }
    public Spitz(int birth_date) {
        this.birth_date = birth_date;
        this.color = "white";
        this.voice = "high";
    }
    public Spitz(int birth_date, String color) {
        this.birth_date = birth_date;
        this.color = color;
        this.voice = "high";
    }
    public Spitz(int birth_date, String color, String voice) {
        this.birth_date = birth_date;
        this.color = color;
        this.voice = voice;
    }
    public void bark() {
        System.out.println("Woof");
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean getCan_defend() {
        return false;
    }
}

class Bulldog extends Dog {
    public boolean can_defend;
    public Bulldog() {
        this.birth_date = 0;
        this.color = "white";
        this.voice = "high";
        this.can_defend = false;
    }
    public Bulldog(int birth_date) {
        this.birth_date = birth_date;
        this.color = "white";
        this.voice = "high";
    }
    public Bulldog(int birth_date, String color) {
        this.birth_date = birth_date;
        this.color = color;
        this.voice = "high";
    }
    public Bulldog(int birth_date, String color, String voice) {
        this.birth_date = birth_date;
        this.color = color;
        this.voice = voice;
    }
    public Bulldog(int birth_date, String color, String voice, boolean can_defend) {
        this.birth_date = birth_date;
        this.color = color;
        this.voice = voice;
        this.can_defend = can_defend;
    }
    public void bark() {
        System.out.println("Roar");
    }
    public void setCan_defend(boolean can_defend) {
        this.can_defend = can_defend;
    }
    public boolean getCan_defend(boolean can_defend) { return this.can_defend;}
    @Override
    public String toString() {
        return "Bulldog{" + "color='" + color + '\'' + ", voice='" + voice + '\'' + ", birth_date=" + birth_date +
                "can defend = " + can_defend + "}";
    }
    @Override
    public boolean getCan_defend() {
        return false;
    }
}
