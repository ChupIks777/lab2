package Pokemons;
import moves.physical.DoubleHit;

public class Weezing extends Koffing {
    public Weezing(java.lang.String name, int level) {
        super(name, level);
        setStats(50, 100, 150, 100, 150, 50);
        super.setMove(new DoubleHit());

    }
}
