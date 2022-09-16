package com.program;

public class App {
    public static void main(String[] args) {
        inp in = new inp();
        String[] name = in.getList();
        for (int i = 0; i < (name.length); i++) {

            System.out.println(name[i].toUpperCase());
        }
    }
}
