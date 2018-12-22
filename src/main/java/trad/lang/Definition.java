package trad.lang;

import java.util.Map;

public class Definition implements Exp {
    private Symbol symbol;
    private Exp value;

    public Definition(Symbol symbol, Exp value) {
        this.symbol = symbol;
        this.value = value;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public Exp eval(Map<String, Exp> env) {
        env.put(symbol.getName(), value);
        return null;
    }
}
