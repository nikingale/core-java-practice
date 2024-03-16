package com.github.nikingale;

import java.util.List;

public class scratch {

    void display() {
        System.out.println("Data " +data);
    }
    int data;
    public static void main(String[] args) {
        int x = 15;
        scratch n = new scratch();
        n.display();

        int v = 25;
        Integer b4 = v;
        Long after = ++b4 ==26 ? 5: new Long(10);
        System.out.println(after.intValue() - b4.intValue());

        StringBuilder sb = new StringBuilder("buffering");
        sb.replace(2,7, "BUFFER");
        sb.delete(2, 4);
        String s = sb.substring(1, 5);
        System.out.println(s);

        if (true) {
            System.out.println("Hey");
        }

        Double d = null;
        System.out.println((d instanceof Double) ? "true" : "f");
    }
}
