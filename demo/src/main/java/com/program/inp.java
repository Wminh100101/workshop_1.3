package com.program;

import java.util.Scanner;

public class inp {
    inp() {
        System.out.println("enter input:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        this.list = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            this.list[i] = sc.nextLine();
        }
        
    }

    private String[] list;
    private int n;

    

    public String[] getList() {

        return this.list;
    }

    public void setList(String[] list) {

        this.list = list;
    }

}
