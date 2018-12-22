package trad.lang;

import java.util.Map;

public interface Exp {
    Exp eval(Map<String, Exp> env);
}
