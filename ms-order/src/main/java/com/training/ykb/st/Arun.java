package com.training.ykb.st;


public class Arun {

    public static void main(final String[] args) {
        A a = new Aproxy(new A());
        System.out.println(a.x());
    }
}
