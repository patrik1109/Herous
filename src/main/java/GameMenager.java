import models.Hero;

public class GameMenager {
    public static void fight(Hero hero1, Hero hero2) throws InterruptedException {


        System.out.println("The battle is start ");
        System.out.println("Hero 1 is "+ hero1.getClass().getSimpleName()+" hp "+hero1.getHp()+" power "+hero1.getPower());
        System.out.println("Hero 2 is "+ hero2.getClass().getSimpleName()+" hp "+hero2.getHp()+" power "+hero2.getPower());
        while (true){

            if(hero1.getHp()<=0){
                System.out.println("Hero "+ hero2.getClass().getSimpleName()+ " WIN!!");

                return;
            }

            else if(hero2.getHp()<=0){
                System.out.println("Hero "+ hero1.getClass().getSimpleName()+ " WIN!!");
                return;
            }
            else {
                System.out.println("Hero " + hero1.getClass().getSimpleName() + " attack " + hero2.getClass().getSimpleName());
                hero1.kick(hero2);

                Thread.sleep(100);
                if (hero2.getHp()>0) {
                    System.out.println("Hero " + hero2.getClass().getSimpleName() + " attack " + hero1.getClass().getSimpleName());
                    hero2.kick(hero1);
                }
            }
        }
    }


}
