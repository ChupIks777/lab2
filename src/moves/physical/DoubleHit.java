package moves.physical;
import ru.ifmo.se.pokemon.*;
public class DoubleHit extends PhysicalMove {
    public DoubleHit  (){
        super(Type.NORMAL, 35, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK, (int) (2 * p.getStat(Stat.ATTACK))));
    }

    @Override
    protected String describe(){
        return "наносит двойной урон противнику, используя Double Hit";
    }
}
