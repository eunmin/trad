package trad.lang;

import java.util.Map;

public class Int implements Exp {
    private Long value;

    public Int(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public Exp eval(Map<String, Exp> env) {
        return this;
    }

    @Override
    public String toString() {
        return "Int{" +
                "value=" + value +
                '}';
    }
}
