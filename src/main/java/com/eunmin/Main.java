package com.eunmin;

import trad.lang.IFn;
import trad.lang.List;

public class Main {

    public static void main(String [] args) {
        List code = new List();

        IFn plus = new IFn() {
            public Object apply(List args) {
                Long sum = new Long(0);
                for (int i = 0; i < args.size(); i++) {
                    sum += (Long)args.get(i);
                }
                return sum;
            }
        };

        code.add(plus);
        code.add(new Long(1));
        code.add(new Long(2));
        System.out.println(code.eval());
    }
}
