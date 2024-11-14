import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon Diancie = new Diancie("Дайанси", 10);
        Pokemon Koffing = new Koffing("Коффинг", 17);
        Pokemon Weezing = new Weezing("Визинг", 25);
        Pokemon Porygon = new Porygon("Поригон", 38);
        Pokemon Porygon2 = new Porygon2("Поригон2", 21);
        Pokemon PorygonZ = new PorygonZ("Поригон-Зед", 11);
        battle.addAlly(Diancie);
        battle.addAlly(Weezing);
        battle.addAlly(Porygon2);
        battle.addFoe(Koffing);
        battle.addFoe(Porygon);
        battle.addFoe(PorygonZ);
        battle.go();
    }
}
