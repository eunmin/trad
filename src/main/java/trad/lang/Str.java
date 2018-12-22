package trad.lang;

import java.util.Map;

public class Str implements Exp {
    private String value;

    public Str(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public Exp eval(Map<String, Exp> env) {
        return this;
    }
}
