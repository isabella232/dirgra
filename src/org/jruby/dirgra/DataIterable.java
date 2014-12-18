package org.jruby.dirgra;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class DataIterable<T> implements Iterable<T> {
    private Collection<Edge<T>> edges;
    private Object type;
    private boolean negate;
    private boolean source;

    public DataIterable(Collection<Edge<T>> edges, Object type, boolean source, boolean negate) {
        this.edges = edges;
        this.type = type;
        this.negate = negate;
        this.source = source;
    }

    @Override
    public Iterator<T> iterator() {
        return new DataIterator<T>(edges, type, source, negate);
    }
}
