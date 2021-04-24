import Characteristics.TypeHerous;
import models.*;

import java.util.HashMap;

public class HeroesFactory
{
    static HashMap<TypeHerous,Hero> mapHerous = new HashMap<>(){{put(TypeHerous.Hobbit, new Hobbit());
                                                           put(TypeHerous.Elf, new Elf());
                                                           put(TypeHerous.King, new King());
                                                           put(TypeHerous.Knight, new Knight());}};
    public static Hero getHero(TypeHerous typeHerous){
        Hero tmp = mapHerous.get(typeHerous);
        return  tmp;
    }

    public static Hero createHero(){
        TypeHerous[] herous = TypeHerous.values();
        TypeHerous  hero = herous[randomGenerate(0,herous.length-1)];
        return getHero(hero);
    }

     static int randomGenerate(int min, int max){
        return (int) (min + Math.random()*(max-min+1));
    }
}
