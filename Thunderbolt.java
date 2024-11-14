package moves.status;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends StatusMove {
    public Thunderbolt  (){
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.10)) Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "наносит урон, используя Thunderbolt и имеет 10% шанс парализовать цель";
    }

}