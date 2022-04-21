package chapter2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SequenceOfNumber {
    int start;
    int end;

    SequenceOfNumber(int begin, int finish) {
        if (begin < finish) {
            start = begin;
            end = finish;
        } else {
            start = finish;
            end = begin;
        }
    }

    public int factorial(int number) {
        int factNumber = 1;
        for (int i = 1; i <= number; i++) {
            factNumber *= i;
        }
        return factNumber;
    }

    public int factorial1(int n) {
        if (n <= 1) return 1;
        else return (n * factorial1(n - 1));
    }

    ArrayList<Integer> numberDigitsList(int number) {
        ArrayList<Integer> digitList = new ArrayList<Integer>();
        while (number > 0) {
            digitList.add(number % 10);
            number /= 10;
        }
        return digitList;
    }

    ArrayList<Integer> numberListOfDigitsFactorials() {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        int sumOfDigitFactorials;
        for (int i = start; i <= end; i++) {
            sumOfDigitFactorials = 0;
            for (int digitFact : numberDigitsList(i)) sumOfDigitFactorials += factorial(digitFact);
            if (i == sumOfDigitFactorials) resultList.add(i);
        }
        return resultList;
    }

    //----------------------------------------
    int fullNumber(ArrayList<Integer> digitsOfNumber) {
        int number = 0;
        int prod = 1;
        for (int i : digitsOfNumber) {
            number += i * prod;
            prod *= 10;
        }
        return number;
    }

    //return the numbers whose sum of arbitrarily increased digits will be equal to the number itself

    ArrayList<Integer> numberListOfSumOfFourDegree(int degree) {
        ArrayList<Integer> resultOfSum = new ArrayList<>();
        int sumOfFourDegree;
        for (int i = start; i <= end; i++) {
            sumOfFourDegree = 0;
            for (int fourDegree : numberDigitsList(i)) sumOfFourDegree += Math.pow(fourDegree, degree);
            if (sumOfFourDegree == i) resultOfSum.add(i);
        }
        return resultOfSum;
    }

    // choose the perfect numbers from the described range

    ArrayList<Integer> perfectNumbers() {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (sumOfNumberDividers(i) == i) perfectNumbers.add(i);
        }
        return perfectNumbers;
    }

    int sumOfNumberDividers(int number) {
        int dividerSum = 0;
        for (int devider = 1; devider < number; devider++) {
            if (number % devider == 0) {
                dividerSum += devider;
            }
        }
        return dividerSum;
    }

    // choose the friend numbers from the described range

    List<ArrayList<Integer>> friendNumber() {
        List<ArrayList<Integer>> friendNumberList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> friendNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
//            friendNumbers.clear();
            for (int j = i; j <= end; j++) {
                if (sumOfNumberDividers(i) == j && sumOfNumberDividers(j) == i && i != j) {
                    friendNumbers.add(i);
                    friendNumbers.add(j);
                    friendNumberList.add(friendNumbers);
                }
            }
        }
        return friendNumberList;
    }
// kollatz sequence

    int CollatzSequenceLength(int number) {
        int lengthQount = 0;
        while (true) {
            if (number == 1) break;
            if (number % 2 == 0) {
                lengthQount++;
                number /= 2;
            } else {
                number = 3 * number + 1;
                lengthQount++;
            }
        }
        return lengthQount;
    }

    // max length Collatz sequence
    ArrayList<Integer> maxLengthCollatzSequence() {
        ArrayList<Integer> maxLengthAndNumber = new ArrayList<>();
        int maxLenght = 0;
        int maxNumber = 0;
        for (int i = start; i <= end; i++) {
            if (CollatzSequenceLength(i) > maxLenght) {
                maxLenght = CollatzSequenceLength(i);
                maxNumber = i;
            }
        }
        maxLengthAndNumber.add(maxNumber);
        maxLengthAndNumber.add(maxLenght);
        return maxLengthAndNumber;
    }

    // lifeCycles of Numbers

    int lifeCycleOfNumbers(int number) {
        int lengthCount = 0;
        int multipleOfDigits = 1;
        int temp = number;
        while (true) {
            for (int digits : numberDigitsList(temp)) {
                multipleOfDigits *= digits;
            }
            temp = multipleOfDigits;

            // System.out.println(multipleOfDigits);
            if (temp > 9) {
                lengthCount++;
                multipleOfDigits = 1;
            } else break;

        }
        return lengthCount;
    }

    //max length og numbers life cycle
    ArrayList<Integer> maxLengthNumbersLifecycle() {
        ArrayList<Integer> maxLengthOfLifecycles = new ArrayList<>();
        int maxLenght = 0;
        int maxNumber = 0;
        for (int i = start; i <= end; i++) {
            if (lifeCycleOfNumbers(i) > maxLenght) {
                maxLenght = lifeCycleOfNumbers(i);
                maxNumber = i;
            }
        }
        maxLengthOfLifecycles.add(maxNumber);
        maxLengthOfLifecycles.add(maxLenght);
        return maxLengthOfLifecycles;
    }

    // Eyler number
    double eylerNumber(int number) {
        double e = 1;
        for (int i = 1; i <= number; i++) {
            e += 1 / (double) factorial(i);
        }
        return e;
    }

    // Pyotagoras number
    double pyutagorasNumber(int number) {
        double pi = 0;
        boolean switch_ = true;
        for (double i = 1; i <= number; i += 2) {
            if (switch_) {
                pi += 1 / i;
                switch_ = false;
            } else {
                pi -= 1 / i;
                switch_ = true;
            }
        }
        return pi * 4;
    }

    // lucky numbers

    ArrayList<Integer> halfNumbers(int number) {
        ArrayList<Integer> resultOfHalfNumbers = new ArrayList<>();
        int firstPartOfDigits = 0;
        int secondPartOfDigits = 0;
        secondPartOfDigits = numberDigitsList(number).get(0) + numberDigitsList(number).get(1) + numberDigitsList(number).get(2);
        firstPartOfDigits = numberDigitsList(number).get(3) + numberDigitsList(number).get(4) + numberDigitsList(number).get(5);
        resultOfHalfNumbers.add(firstPartOfDigits);
        resultOfHalfNumbers.add(secondPartOfDigits);
        return resultOfHalfNumbers;
    }

    ArrayList<Integer> luckyNumbers() {
        ArrayList<Integer> resultOfLuckyNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {

            halfNumbers(i);
            if (halfNumbers(i).get(0) == halfNumbers(i).get(1)) resultOfLuckyNumbers.add(i);
        }
        return resultOfLuckyNumbers;
    }

    // beauty sequences

    ArrayList<Integer> beautySequence1() {
        ArrayList<Integer> beautySequenceWith8 = new ArrayList<>();
        int newNumber = 0;
        for (int i = 1; i <= 9; i++) {
            newNumber = 10 * newNumber + i;
            beautySequenceWith8.add(newNumber * 8 + i);
        }
        return beautySequenceWith8;
    }

    ArrayList<Integer> beautySequence2() {
        ArrayList<Integer> beautySequenceWith9 = new ArrayList<>();
        int newNumber = 0;
        for (int i = 1; i <= 9; i++) {
            newNumber = 10 * newNumber + i;
            beautySequenceWith9.add(newNumber * 9 + i + 1);
        }
        return beautySequenceWith9;
    }

    ArrayList<Integer> beautySequence3() {
        ArrayList<Integer> resultOfBeautySequence = new ArrayList<>();
        int newnUmber = 0;
        for (int i = 9; i >= 2; i--) {
            newnUmber = 10 * newnUmber + i;
            resultOfBeautySequence.add(newnUmber * 9 + i - 2);
        }
        return resultOfBeautySequence;
    }

    ArrayList<Integer> beautySequence4() {
        ArrayList<Integer> resultOfBeautySequence4 = new ArrayList<>();
        for (int i = 9; i <= 81; i = i + 9) {
            resultOfBeautySequence4.add(12345679 * i);
        }
        return resultOfBeautySequence4;
    }

    ArrayList<Long> beautySequence5() {
        ArrayList<Long> resultOfBeautySequence5 = new ArrayList<>();
        long newNumber = 6;
        for (int i = 1; i <= 9; i++) {
            resultOfBeautySequence5.add(newNumber * (newNumber + 1));
            newNumber = newNumber * 10 + 6;
        }
        return resultOfBeautySequence5;
    }

    // fibonachi sequence
    ArrayList<Long> fibonachiSequence(int count) {
        ArrayList<Long> resultOfFibonachiSequence = new ArrayList<>();
        long fib1 = 1;
        long fib2 = 1;
        long fib = 0;
        resultOfFibonachiSequence.add(fib1);
        resultOfFibonachiSequence.add(fib2);
        for (int i = 1; i < count - 1; i++) {
            fib = fib1 + fib2;
            resultOfFibonachiSequence.add(fib);
            fib1 = fib2;
            fib2 = fib;
        }
        return resultOfFibonachiSequence;
    }

    public ArrayList<Long> fibonachiSequence2() {
        ArrayList<Long> resultOfFibonachiSequence = new ArrayList<>();
        long fib1 = 1;
        long fib2 = 1;
        long fib = 0;
        if (start == 1) {
            resultOfFibonachiSequence.add(1L);
            resultOfFibonachiSequence.add(1L);

        }
        while (true) {
            fib = fib1 + fib2;
            if (fib > end) break;
            if (fib >= start) resultOfFibonachiSequence.add(fib);
            fib1 = fib2;
            fib2 = fib;
        }
        return resultOfFibonachiSequence;
    }

    // sequence with K
    boolean checkTheK(int k) {
        int n;
        int sumOfN = 0;
        for (int i = 1; ; i++) {
            sumOfN += i;
            if (sumOfN == k) return true;
            if (sumOfN > k) return false;
        }
    }

    //---------max number of dividers---------------------------
    int countOfDividers(int number) {
        int dividerCount = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) dividerCount++;
        }
        return dividerCount;
    }

    ArrayList<Integer> maxDividersOfRange() {
        ArrayList<Integer> resultOfDividersAndRange = new ArrayList<>();
        int maxCountOfDividers = 0;
        int maxDividersNumber = 0;
        for (int i = start; i <= end; i++) {
            countOfDividers(i);
            if (countOfDividers(i) >= maxCountOfDividers) {
                maxCountOfDividers = countOfDividers(i);
                maxDividersNumber = i;
            }
        }
        resultOfDividersAndRange.add(maxDividersNumber);
        resultOfDividersAndRange.add(maxCountOfDividers);
        return resultOfDividersAndRange;
    }

    //--------------------------------------------
    int sumOfDigits(int number) {
        int digitsSum = 0;
        for (int digit : numberDigitsList(number)) digitsSum += digit;
        return digitsSum;
    }

    int multipleOfDigits(int number) {
        int digitsMultiple = 1;
        for (int digit : numberDigitsList(number)) digitsMultiple *= digit;
        return digitsMultiple;
    }

    ArrayList<Integer> threeDigitNumbers() {
        ArrayList<Integer> resultOfThreeDigitNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (sumOfDigits(i) >= 10 && sumOfDigits(i) < 100 && multipleOfDigits(i) >= 100 && multipleOfDigits(i) < 1000)
                resultOfThreeDigitNumbers.add(i);
        }
        return resultOfThreeDigitNumbers;
    }

    int numberWithFourDigits() {
        int number;
        for (int i = 1000; i < 10000; i++) {
            number = 0;
            for (int digit : numberDigitsList(i)) number += digit;
            if (number == 15) return i;
        }
        return -1;
    }

    StringBuilder numbersWithFourDigits() {
        //ArrayList<Integer> resultOfNumbers=new ArrayList<>();
        StringBuilder RN = new StringBuilder();
        int number;
        for (int i = 1000; i < 1100; i++) {
            number = 0;
            for (int digit : numberDigitsList(i)) number += digit;
            if (number == 15) RN.append(i + ", "); //resultOfNumbers.add(i);
        }
        return RN;
    }

    public void triangle() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) System.out.print("  ");
            for (int j = i; j > 0; j--) System.out.print("*   ");
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) System.out.print("   *");
            for (int j = i; j > 0; j--) System.out.print("    ");
            System.out.println();

        }
    }

}
