package trad.lang;

import java.util.Map;

public class Symbol implements Exp {
    private String name;

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Exp eval(Map<String, Exp> env) {
        return env.get(name);
    }
}
