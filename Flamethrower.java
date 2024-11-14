package moves.special;
import ru.ifmo.se.pokemon.*;
public class Flamethrower extends SpecialMove {
    public Flamethrower (){
        super(Type.FIRE, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.10)) Effect.burn(p);
    }

    @Override
    protected String describe() {
        return "наносит урон, используя Flamethrower и имеет 10% шанс поджечь цель";
    }

}