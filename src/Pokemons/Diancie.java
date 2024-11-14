package Pokemons;
import moves.physical.Facade;
import moves.physical.RockThrow;
import moves.special.DazzlingGleam;
import moves.status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Diancie extends Pokemon {
    public Diancie(java.lang.String name, int level) {
        super(name, level);
        super.setStats(50, 100, 150, 100, 150, 50);
        super.setType(Type.ROCK, Type.FAIRY);
        super.setMove(new DazzlingGleam(), new RockThrow(), new Facade(), new Swagger());
    }
}
