package Pokemons;

import moves.special.Blizzard;;
public class PorygonZ extends Porygon2 {
    public PorygonZ(java.lang.String name, int level) {
        super(name, level);
        setStats(85, 80, 70, 135, 75, 90);
        setMove(new Blizzard());

    }
}
