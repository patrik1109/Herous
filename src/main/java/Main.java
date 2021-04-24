import Characteristics.TypeHerous;
import models.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

     //   Hero hero1 = HeroesFactory.getHero(TypeHerous.Elf);
     //   Hero hero2 = HeroesFactory.getHero(TypeHerous.Knight);

        Hero hero1 = HeroesFactory.createHero();
        Hero hero2 = HeroesFactory.createHero();
        GameMenager.fight(hero1,hero2);
    }
}
