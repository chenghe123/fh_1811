package com.fh.shop.api;

public class test implements Runnable{
    public void run() {
        add();
    }

    private Integer count;
    public void add(){
        count++;
    }
}
