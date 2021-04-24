package models;

import lombok.Data;

@Data
public class Elf extends Hero{

    private int power = 10;
    private int hp = 10;

    @Override
    public void kick(Hero hero) {
        String enemy = hero.getClass().getSimpleName();
        if(hero.getPower()<this.power){
            hero.setHp(0);
            resultAttack(enemy,power);
        }
        else{
            int enemyPower = hero.getPower();
            hero.setPower(--enemyPower);
            System.out.println("Elf decreace " + enemy +" "+ power+" by 1");
        }
    }
}
