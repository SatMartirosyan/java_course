package chapter2;

public class Checker {
    boolean isPrimeNumber(int checkNumber) {
        if (checkNumber == 0 || checkNumber == 1) {
            return false;
        } else {
            for (int divider = 2; divider < checkNumber; divider++) {
                if (checkNumber % divider == 0) return false;
            }
            return true;
        }
    }

}
