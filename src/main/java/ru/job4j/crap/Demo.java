package ru.job4j.crap;

class Rethrow {
    public static void genException() {

        int[] numer = {4, 5, 6, 7, 5, 8, 8, 6, 4};
        int[] denom = {2, 3, 0, 1, 0, 2};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Can't divide by zero");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("No matching");
                throw exc;
            }
        }
    }
}

class Demo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("FATAL ERROR! Terminated!");
        }
    }
}

