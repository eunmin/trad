package trad.lang;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Begin implements Exp {
    private List<Exp> exps;

    public Begin(Exp ... exps) {
        this.exps = Arrays.asList(exps);
    }

    public Iterator getExps() {
        return exps.iterator();
    }

    @Override
    public Exp eval(Map<String, Exp> env) {
        Exp result = null;
        Iterator it = exps.iterator();
        while(it.hasNext()) {
            result = ((Exp)it.next()).eval(env);
        }
        return result;
    }
}
