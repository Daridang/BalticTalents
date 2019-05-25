package oop1.p0523;

import lt.baltictalents.string.StringCreator;

public class Main {
    public static void main(String[] args) {
        StringCreator creator = new StringCreator();
        String nul = null;
        System.out.println(creator.create("heliou world", " heliou"));
        System.out.println(creator.create() + " no arguments");
        System.out.println(creator.create("A", "B", "C"));
        //System.out.println(creator.create(nul, nul));
        System.out.println(creator.create(nul, nul, nul));
    }
}
