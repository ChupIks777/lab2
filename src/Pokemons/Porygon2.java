package Pokemons;

import moves.status.DefenceCurl;

public class Porygon2 extends Porygon{
    public Porygon2(java.lang.String name, int level) {
        super(name, level);
        setStats(85, 80, 90, 105, 95, 60);
        setMove(new DefenceCurl());

    }
}
