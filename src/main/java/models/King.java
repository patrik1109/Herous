package models;



public class King extends Hero {
    static int minPower = 5;
    static int maxPower = 15;
    static int minHp = 5;
    static int maxHp =15;

    public King(){
        this.hp = randomGenerate(minHp,maxHp);
        this.power = randomGenerate(minPower,maxPower);
    }
    @Override
    public void kick(Hero hero) {
        int damage = randomGenerate(minPower,maxPower);
        String enemy = hero.getClass().getSimpleName();

        hero.setHp(hero.getHp()-damage);
        resultAttack(enemy,damage);

    }

    public static int randomGenerate(int min, int max){
        return (int) (min + Math.random()*(max-min+1));
    }
}
