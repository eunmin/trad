package trad.lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application implements Exp {
    private Procedure operator;
    private List<Exp> operands;

    public Application(Procedure operator, List<Exp> operands) {
        this.operator = operator;
        this.operands = operands;
    }

    public Procedure getOperator() {
        return operator;
    }

    public List<Exp> getOperands() {
        return operands;
    }

    @Override
    public Exp eval(Map<String, Exp> env) {
        List<Exp> args = new ArrayList<Exp>();
        for (Exp arg: operands) {
            args.add(arg.eval(env));
        }
        return operator.apply(args);
    }
}