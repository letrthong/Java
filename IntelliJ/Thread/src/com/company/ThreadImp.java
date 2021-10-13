package com.company;

public class ThreadImp  implements  Runnable{
    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
