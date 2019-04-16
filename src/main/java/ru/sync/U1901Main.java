package ru.sync;

public class U1901Main {
    public static void main(String[] args) {
        U1901Bank bankMain = new U1901Bank();
        U1901Thread threadOne = new U1901Thread(bankMain, 100, 2000);
        threadOne.setName(" main thread ");
        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadOne.start();


        U1901Thread threadTwo = new U1901Thread(bankMain, 50, 300);
        threadTwo.setName(" not main thread ");
        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();

        System.out.println(Thread.currentThread().getName());


    }

}
