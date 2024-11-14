package Pokemons;
import moves.status.Confide;
import moves.special.Flamethrower;
import moves.status.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Koffing extends Pokemon {
    public Koffing(java.lang.String name, int level) {
        super(name, level);
        setStats(50, 100, 150, 100, 150, 50);
        super.setType(Type.POISON);
        super.setMove(new Flamethrower(), new Thunderbolt(), new Confide());

    }
}
