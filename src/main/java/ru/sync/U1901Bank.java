package ru.sync;

public class U1901Bank {
    private int intTo;
    private int intFrom = 220;

    public void calc(int intTransaction, long lngTimeout) {
        System.out.print("Before ");
        System.out.println(Thread.currentThread().getName());

        System.out.println("intTo = " + intTo + " intFrom = " + intFrom);
        intFrom = intFrom - intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        intTo = intTo + intTransaction;
        System.out.print("After ");
        System.out.println(Thread.currentThread().getName());
        System.out.println("intTo = " + intTo + " intFrom = " + intFrom);

    }

}
