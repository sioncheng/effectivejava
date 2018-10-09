package com.github.sioncheng.effectivejava.ch4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<T> implements Set<T> {

    private final Set<T> s;


    public ForwardingSet(Set<T> s) {
        this.s = s;
    }

    public void clear()               { s.clear();            }
    public boolean contains(Object o) { return s.contains(o); }
    public boolean isEmpty() {return s.isEmpty();}
    public int size() {return s.size();}
    public Iterator<T> iterator() {return s.iterator();}
    public boolean add(T e) {return s.add(e);}
    public boolean remove(Object o) {return s.remove(o);}
    public boolean containsAll(Collection<?> c) {return s.containsAll(c);}
    public boolean addAll(Collection<? extends T> c) { return s.addAll(c);      }
    public boolean removeAll(Collection<?> c) { return s.removeAll(c);   }
    public boolean retainAll(Collection<?> c) { return s.retainAll(c);   }
    public Object[] toArray()          { return s.toArray();  }
    public <E> E[] toArray(E[] a)      { return s.toArray(a); }
    @Override public boolean equals(Object o) { return s.equals(o);  }
    @Override public int hashCode()    { return s.hashCode(); }
    @Override public String toString() { return s.toString(); }
}
