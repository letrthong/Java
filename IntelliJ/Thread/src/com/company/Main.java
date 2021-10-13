package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadImp obj = new ThreadImp();
        Thread thread = new Thread(obj);
        thread.start();
        thread.join(1000);
        System.out.println("This code is outside of the thread");
    }
}
