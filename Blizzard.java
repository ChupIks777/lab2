package moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        if (Math.random() <= 0.10){
            Effect.freeze(p);
        }

    }

    @Override
    protected String describe(){
        return "наносит урон, используя Blizzard, и замораживает с шансом 10%";
    }
}
