package org.futureCollars.lesson6.task9;

public class ValidationOfDivisibilityBy3 {

    public static void main(String[] args) {
        validation(new int[]{3, 6, 5, 21});
    }

    public static void validation(int[] values) {
        for (int i = 0; i < values.length; i++) {
            try {
                if (values[i] % 3 != 0) {
                    throw new IllegalArgumentException("Number:" + values[i] + " is not divisible by 3");
                }
                System.out.println("Number:" + values[i] + " is divisible by 3");
            } catch (IllegalArgumentException exception) {
                System.out.println("Exception was throw, expection " + exception.getMessage());
            }
        }
    }
}
