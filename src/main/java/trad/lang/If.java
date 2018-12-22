package trad.lang;

import java.util.Map;

public class If implements Exp {
    private Bool predicate;
    private Exp successExp;
    private Exp failExp;

    public If(Bool predicate, Exp successExp, Exp failExp) {
        this.predicate = predicate;
        this.successExp = successExp;
        this.failExp = failExp;
    }

    public Bool getPredicate() {
        return predicate;
    }

    public Object getSuccessExp() {
        return successExp;
    }

    public Object getFailExp() {
        return failExp;
    }

    public Exp eval(Map<String,Exp> env) {
        if(predicate.getValue() == true) {
            return successExp.eval(env);
        }
        else {
            return failExp.eval(env);
        }
    }
}
