package pract1;

public class Ball
{
    private String color;
    private int radius;
    private String game;

    public Ball(String inputColor,int inputRadius,String inputGame)
    {
        color=inputColor;
        radius=inputRadius;
        game=inputGame;
    }
    public Ball(String inputColor,int inputRadius)
    {
        color=inputColor;
        radius=inputRadius;
        game="Unknown";
    }
    public void setGame(String game)
    {
        this.game=game;
    }
    public String  getColor()
    {
        return this.color;
    }
    public int  getRadius()
    {
        return this.radius;
    }
    public String  getGame()
    {
        return this.game;
    }
    public String toString()
    {
        return this.color+",  radius "+this.radius+",  game "+this.game;
    }
    public String output()
    {
        return "Ball \n "+"Color: "+this.color+"\n Radius: "+this.radius+"\n For: "+this.game;
    }
}
