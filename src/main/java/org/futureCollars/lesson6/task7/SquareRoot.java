package org.futureCollars.lesson6.task7;

public class SquareRoot {

    private SquareRoot(){};
    public static double getSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("No possible count square root from negative number");
        }
        return Math.sqrt(number);
    }
}
