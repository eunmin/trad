package trad.lang;

import java.util.List;

public interface Procedure {
    Exp apply(List<Exp> args);
}
