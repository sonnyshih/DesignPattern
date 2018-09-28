package com.DesignPattern.SingletonPattern.ChocolateDemo;

public class ChocolateFactoryDemo {
    public static void main(String[] args) {

        // Normal instance
        // The instance is not single.
        MyThread thread1 = new MyThread(1);
        thread1.start();

        MyThread thread2 = new MyThread(2);
        thread2.start();

        // Sync instance
        // The instance is real single but performance is not good.
        MyThread2 thread3 = new MyThread2(1);
        thread3.start();

        MyThread2 thread4 = new MyThread2(2);
        thread4.start();


    }
}

class MyThread extends Thread {

    private int index;

    public MyThread(int index){
        this.index = index;
    }

    @Override
    public void run() {
        super.run();
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        System.out.println("index = " + index + " chocolateBoiler object="+chocolateBoiler);
    }
}

class MyThread2 extends Thread {
    private int index;

    public MyThread2(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        super.run();
        ChocolateBoilerWithSync chocolateBoilerWithSync = ChocolateBoilerWithSync.getInstance();
        System.out.println("index = " + index + " ChocolateBoilerWithSync object="+chocolateBoilerWithSync);
    }
}
