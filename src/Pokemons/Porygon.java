package Pokemons;
import moves.special.DreamEater;
import moves.status.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Porygon extends Pokemon {
    public Porygon(java.lang.String name, int level) {
        super(name, level);
        setStats(50, 100, 150, 100, 150, 50);
        super.setType(Type.ROCK, Type.FAIRY);
        setMove(new Thunderbolt(), new DreamEater());

    }
}
