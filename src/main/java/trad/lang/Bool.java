package trad.lang;

import java.util.Map;

public class Bool implements Exp {

    private final boolean value;

    public Bool(boolean value) {
        this.value = value;
    }

    @Override
    public Exp eval(Map<String, Exp> env) {
        return this;
    }

    public boolean getValue() {
        return value;
    }
}
