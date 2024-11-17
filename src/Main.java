import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon diancie = new Diancie("Дайанси", 10);
        Pokemon koffing = new Koffing("Коффинг", 17);
        Pokemon weezing = new Weezing("Визинг", 25);
        Pokemon porygon = new Porygon("Поригон", 38);
        Pokemon porygon2 = new Porygon2("Поригон2", 21);
        Pokemon PorygonZ = new PorygonZ("Поригон-Зед", 11);
        
        battle.addAlly(diancie);
        battle.addAlly(weezing);
        battle.addAlly(porygon2);
        battle.addFoe(koffing);
        battle.addFoe(porygon);
        battle.addFoe(porygonZ);
        
        battle.go();
    }
}
