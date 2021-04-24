package models;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Hero {

    int power;
    int hp;

    public  boolean isAlive() {

        return this.getHp() >= 0 ? true : false;

    }

    public abstract void kick(Hero hero);

    public void resultAttack(String enemy, int damage){
        System.out.println(this.getClass().getSimpleName() +
                " attack enemy " + enemy+
                " and hit him " + damage);
    }

}
