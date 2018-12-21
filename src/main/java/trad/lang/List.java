package trad.lang;

import java.util.ArrayList;

public class List {
    private java.util.List items = new ArrayList();

    public List() {}

    private List(java.util.List items) {
        this.items = items;
    }

    public Object get(int i) {
        return items.get(i);
    }

    public int size() {
        return items.size();
    }

    public void add(Object value) {
        items.add(value);
    }

    public Object eval() {
        if (items.isEmpty()) {
            return this;
        }
        IFn fn = (IFn)items.get(0);
        return fn.apply(new List(items.subList(1, items.size())));
    }
}
