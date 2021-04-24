package models;

public class Knight extends King{

    public static int minPower = 2;
    public static int maxPower = 12;
    public static int minHp = 2;
    public static int maxHp =12;

    public Knight(){
        this.hp = randomGenerate(minHp,maxHp);
        this.power = randomGenerate(minPower,maxPower);
    }
}
