package moves.special;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    static boolean flag = false;
    @Override
    protected void applySelfEffects(Pokemon p){
        if(p.getCondition().equals(Status.SLEEP)) {
            p.addEffect(new Effect().stat(Stat.ATTACK, (int) (p.getStat(Stat.ATTACK))));
            flag = true;

        } else{
            p.addEffect(new Effect().stat(Stat.ATTACK, (int) (0 * p.getStat(Stat.ATTACK))));
        }

    }

    protected void applyOppEffects(Pokemon p) {
        if (flag) {
            p.addEffect(new Effect().stat(Stat.HP, (int) (1.5 * p.getStat(Stat.HP))));
        }
    }

    @Override
    protected String describe(){
        return "наносит урон при помощи DreamEater только спящим врагам. Восстанавливает 50% потерянного HP";
    }
}
