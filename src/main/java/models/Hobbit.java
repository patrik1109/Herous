package models;

import lombok.Data;

@Data
public class Hobbit extends Hero{

    protected int power = 0;
    protected int hp = 3;

    @Override
    public void kick(Hero hero) {
        System.out.println("AAAAA Piace to piace!!!");
    }
}
