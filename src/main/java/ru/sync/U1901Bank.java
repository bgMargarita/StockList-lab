package ru.sync;

public class U1901Bank {
    private int intTo;
    private int intFrom = 220;

    public void calc(int intTransaction, long lngTimeout) {
        System.out.println("Before");
        System.out.println("intTransition = " + intTransaction + " lngTimeout = " + lngTimeout);
        System.out.println(Thread.currentThread().getName());
        intFrom = intFrom - intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        intTo = intTo + intTransaction;
        System.out.println(Thread.currentThread().getName());
        System.out.println("After");
        System.out.println("intTransition = " + intTransaction + " lngTimeout = " + lngTimeout);
    }

}
