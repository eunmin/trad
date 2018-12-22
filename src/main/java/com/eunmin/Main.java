package com.eunmin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import trad.lang.*;

public class Main {
    public static List listOf(Object ... items) {
        return Arrays.asList(items);
    }

    public static void main(String [] args) {
        Map<String, Exp> env = new HashMap<String, Exp>();

        Procedure plus = new Procedure() {
            @Override
            public Exp apply(java.util.List<Exp> args) {
                Long x = ((Int) args.get(0)).getValue();
                Long y = ((Int) args.get(1)).getValue();
                return new Int(new Long(x + y));
            }
        };

        /*
        (begin
          (def x 1)
          (def y 2)
          (def z (더하기함수 1 1))
          (if false
            0
            (더하기함수값 z (더하기함수값 x y)))
        */
        Begin begin = new Begin(
                new Definition(new Symbol("x"), new Int(new Long(1))),
                new Definition(new Symbol("y"), new Int(new Long(2))),
                new Definition(new Symbol("z"), new Application(plus, listOf(new Long(1), new Long(1)))),
                new If(new Bool(false),
                        new Int(new Long(0)),
                        new Application(plus, listOf(new Symbol("z"), new Application(plus, listOf(new Symbol("x"), new Symbol("y")))))));

        System.out.println(begin.eval(env));
    }
}
