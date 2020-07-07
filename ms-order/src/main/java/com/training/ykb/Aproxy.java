package com.training.ykb;


public class Aproxy extends A {

    private final A a;

    @Override
    public String x() {
        // trans
        String xLoc = this.a.x();
        // commit
        return xLoc + " proxied";
    }

    @Override
    public int y() {
        return this.a.y();
    }

    public Aproxy(final A a) {
        this.a = a;
    }
}
