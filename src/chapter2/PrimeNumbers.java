package chapter2;

import java.util.ArrayList;

public class PrimeNumbers {
    int start;
    int end;

    PrimeNumbers(int begin, int finish) {
        start = begin;
        end = finish;
    }

    public void primeNumberList() {
        boolean marker;
        for (int number = start; number <= end; number++) {
            marker = true;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    marker = false;
                    break;
                }
            }
            if (marker) {
                System.out.println(number);
            }

        }
    }

    public int sumOfPrimeNumbers() {
        int sumOfNumbers = 0;
        for (int number = start; number <= end; number++) {
            if (isPrimeNumber(number)) sumOfNumbers += number;
        }
        return sumOfNumbers;
    }

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

    ArrayList<Integer> primeSumOfPrimeNumbers() {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        int number = 0;
        int inc = 0;
        while (true) {
            inc++;
            if (isPrimeNumber(inc)) {
                number += inc;
                if (number > start) {
                    if (number > end) break;
                    if (isPrimeNumber(number)) resultList.add(number);
                }
            }
        }
        return resultList;
    }

    // digit cycle
    ArrayList<Integer> numberDigitsList(int number) {
        ArrayList<Integer> digitList = new ArrayList<Integer>();
        while (number > 0) {
            digitList.add(number % 10);
            number /= 10;
        }
        return digitList;
    }

    int fullNumber(ArrayList<Integer> digitsOfNumber) {
        int number = 0;
        int prod = 1;
        for (int i : digitsOfNumber) {
            number += i * prod;
            prod *= 10;
        }
        return number;
    }

    int digitCycle(int number) {
        ArrayList<Integer> tempList = new ArrayList<>();
        tempList = numberDigitsList(number);
        int fist = tempList.get(0);
        tempList.remove(0);
        tempList.add(fist);
        return fullNumber(tempList);

    }

    ArrayList<Integer> cyclePrimeNumber() {
        ArrayList<Integer> resultList = new ArrayList<>();
        int temp = 0;
        boolean check;
        for (int i = start; i <= end; i++) {
            check = true;
            if (i > 10 && isPrimeNumber(i)) {
                temp = i;
                for (int j = 0; j < numberDigitsList(i).size() - 1; j++) {
                    if (!isPrimeNumber(digitCycle(temp))) {
                        check = false;
                        break;
                    }
                    temp = digitCycle(temp);
                }
                if (check) resultList.add(i);
            }
        }
        return resultList;
    }

    // twin numbers

    ArrayList<Integer> twinNumbers() {
        ArrayList<Integer> resultOfTwinNumbers = new ArrayList<>();
        int firstPrimeNumber = 0;
        int secondPrimeNumber = 2;
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                firstPrimeNumber = secondPrimeNumber;
                secondPrimeNumber = i;
                if (secondPrimeNumber - firstPrimeNumber == 2) {
                    resultOfTwinNumbers.add(firstPrimeNumber);
                    resultOfTwinNumbers.add(secondPrimeNumber);
                }
            }
        }
        return resultOfTwinNumbers;
    }

    //----------------prime dividers---------------------
    ArrayList<Integer> primeDividersOfNumber(int number) {
        ArrayList<Integer> resultOfPrimeDividers = new ArrayList<>();
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0 && isPrimeNumber(i)) {
                resultOfPrimeDividers.add(i);
            }
        return resultOfPrimeDividers;
    }
}
