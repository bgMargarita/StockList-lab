package ru.sync;

public class U1901Bank {
    private int intTo;
    private int intFrom = 220;

    public synchronized void calc(int intTransaction, long lngTimeout) {

            System.out.println("Before  " + Thread.currentThread().getName() + "intTo = " + intTo + " intFrom = " + intFrom);
        intFrom = intFrom - intTransaction;

        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
            intTo = intTo + intTransaction;
            System.out.println("After  " + Thread.currentThread().getName() + "intTo = " + intTo + " intFrom = " + intFrom);

    }

}
