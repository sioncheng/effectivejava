package com.github.sioncheng.effectivejava.ch3;

public class Point implements Comparable<Point>, Cloneable {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", this.x,this.y);
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null
                && (obj instanceof Point)
                && instanceEquals((Point)obj);
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public Point clone()  {
        return new Point(this.x, this.y);
    }

    @Override
    public int compareTo(Point o) {
        return this.toString().compareTo(o.toString());
    }

    private boolean instanceEquals(Point that) {
        return this.x == that.x && this.y == that.y;
    }
}
