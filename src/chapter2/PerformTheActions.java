package chapter2;

public class PerformTheActions {
    public static void main(String[] args) {
//        int num = 48;
//        int number = 5;
//        System.out.println(num+number);
//        System.out.println(num/number);
//        System.out.println(num%number);
//        System.out.println(num>number);
//        boolean check = (num<number);
//        System.out.println(check);
//        double result = ((double) num/(double) number);
//        System.out.println(result);
//        String firstName = "saten";
//        System.out.println(firstName+" "+"QA");
//
//        int sum1 = 10;
//        int sum2 = 20 + sum1;
//        int sum3 = sum1 + sum2;
//        System.out.println(sum3);
//        int num = 48;
//        int number = 5;
//        if (number == num) {
//            System.out.println(num + number);
//        } else if (num > number) {
//            if (num < 0)
//                System.out.println(number * 2);
//        } else if (num > 0) {
//            System.out.println(number * 3);
//        } else {
//            System.out.println(num - number);
//        }
//        if (num > 0) {
//            System.out.println(number * 3);
//        }
//        switch (number) {
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            case 5:
//                System.out.println(5);
//                break;
//            default:
//                System.out.println("default");
//        }
// This is if statement block
//        int checkTheNumber = 567;
//        int checkTheNumber2 = 4;
//        int checkTheNumber3 = 5;
//        byte imp = 0;
//        if (checkTheNumber == 0) {
//            System.out.println("number is 0");
//        } else if (checkTheNumber % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//
//
//        if (checkTheNumber == 0) {
//            System.out.println("number is 0");
//        } else {
//            if (checkTheNumber % 2 == 0) {
//                System.out.println("even");
//            } else {
//                System.out.println("odd");
//            }
//        }
//
//        if (checkTheNumber == 0 || checkTheNumber > 0) {
//            System.out.println(checkTheNumber);
//        } else {
//            System.out.println(checkTheNumber * (-1));
//        }
//
//        if (checkTheNumber2 != 0) {
//            System.out.println(checkTheNumber / checkTheNumber2);
//        }
//
//        if (checkTheNumber > checkTheNumber2) {
//            System.out.println(checkTheNumber);
//        } else {
//            System.out.println(checkTheNumber2);
//        }
//        System.out.println("----------------------------------------------------------------------------------");
//        if ((checkTheNumber > checkTheNumber2 && checkTheNumber > checkTheNumber3) && checkTheNumber2 > checkTheNumber3) {
//            System.out.println(checkTheNumber);
//            System.out.println(checkTheNumber2);
//            System.out.println(checkTheNumber3);
//        } else if ((checkTheNumber > checkTheNumber2 && checkTheNumber > checkTheNumber3) && checkTheNumber2 < checkTheNumber3) {
//            System.out.println(checkTheNumber);
//            System.out.println(checkTheNumber3);
//            System.out.println(checkTheNumber2);
//        } else if ((checkTheNumber2 > checkTheNumber && checkTheNumber2 > checkTheNumber3) && checkTheNumber > checkTheNumber3) {
//            System.out.println(checkTheNumber2);
//            System.out.println(checkTheNumber);
//            System.out.println(checkTheNumber3);
//        } else if ((checkTheNumber2 > checkTheNumber && checkTheNumber2 > checkTheNumber3) && checkTheNumber < checkTheNumber3) {
//            System.out.println(checkTheNumber2);
//            System.out.println(checkTheNumber3);
//            System.out.println(checkTheNumber);
//        } else if ((checkTheNumber3 > checkTheNumber && checkTheNumber3 > checkTheNumber2) && checkTheNumber > checkTheNumber2) {
//            System.out.println(checkTheNumber3);
//            System.out.println(checkTheNumber);
//            System.out.println(checkTheNumber2);
//        } else {
//            System.out.println(checkTheNumber3);
//            System.out.println(checkTheNumber2);
//            System.out.println(checkTheNumber);
//        }
//        System.out.println("-------------------------------------------------------------------------------------");
//        if (checkTheNumber % 2 == 0) ++imp;
//        if (checkTheNumber2 % 2 == 0) ++imp;
//        if (checkTheNumber3 % 2 == 0) ++imp;
//        if (imp >= 2) System.out.println("true");
//        else System.out.println("false");
//
//        System.out.println("------------------------------------------------------------------------------------");
//
//        if (checkTheNumber * checkTheNumber + checkTheNumber2 * checkTheNumber2 == checkTheNumber3*checkTheNumber3)
//            System.out.println("true");
//        else if (checkTheNumber * checkTheNumber + checkTheNumber3 * checkTheNumber3 == checkTheNumber2*checkTheNumber2)
//            System.out.println("true");
//        else if (checkTheNumber2 * checkTheNumber2 + checkTheNumber3 * checkTheNumber3 == checkTheNumber*checkTheNumber)
//            System.out.println("true");
//        else System.out.println("false");

        //System.out.println("------------------------------------------------------------------------------------");

//        int testNumber = 467;
//        int sumOfDigits = 0;
//        while (testNumber > 0) {
//            sumOfDigits += testNumber % 10;
//            System.out.println(testNumber % 10);
//            testNumber /= 10;
//        }
//        System.out.println(sumOfDigits);

        //System.out.println("------------------------------------------------------------------------------------");
        int testNumber2 = 121;
        int testNumber3 = testNumber2;
        int sumOfDigits2 = 0;
        while (testNumber2 > 0) {
            sumOfDigits2 += testNumber2 % 10;
            testNumber2 /= 10;
        }
        //
        System.out.println(sumOfDigits2);
        int temp = 0;
        int sumOfDigitsTemp = 0;
        for (int i = 100; i < 1000; i++) {
            temp = i;
            while (temp > 0) {
                sumOfDigitsTemp += temp % 10;
                temp /= 10;
            }

            if (sumOfDigits2 == sumOfDigitsTemp && i != testNumber3) {
                System.out.println(i);
                break;


            } else {
                sumOfDigitsTemp = 0;

            }

        }


//
        PrimeNumbers primeNumbers1 = new PrimeNumbers(1, 1000);
//        System.out.println(primeNumbers1.primeSumOfPrimeNumbers());
//        System.out.println(primeNumbers1.isPrimeNumber(1));
//        System.out.println(primeNumbers1.digitCycle(2865));
//        System.out.println(primeNumbers1.cyclePrimeNumber());
        System.out.println(primeNumbers1.primeDividersOfNumber(1743));
        //System.out.println(primeNumbers1.twinNumbers());


        SequenceOfNumber factorialOfNumber1 = new SequenceOfNumber(100, 105);
//        System.out.println(factorialOfNumber1.factorial(15));
//        System.out.println(factorialOfNumber1.fullNumber(factorialOfNumber1.numberDigitsList(25874)));
//        System.out.println(factorialOfNumber1.numberListOfDigitsFactorials());
//        System.out.println(factorialOfNumber1.numberListOfsumOfFourDegree(6));
//        System.out.println(factorialOfNumber1.perfectNumbers());
//        System.out.println(factorialOfNumber1.friendNumber());
//        System.out.println(factorialOfNumber1.numberDigitsList(25890));
//        System.out.println(factorialOfNumber1.CollatzSequenceLength(13));
        // System.out.println(factorialOfNumber1.maxLengthCollatzSequence());
//        System.out.println(factorialOfNumber1.lifeCycleOfNumbers(37));
//        System.out.println(factorialOfNumber1.maxLengthNumbersLifecycle());
        System.out.println(factorialOfNumber1.eylerNumber(33));
        System.out.println(factorialOfNumber1.pyutagorasNumber(50000));
        System.out.println(factorialOfNumber1.halfNumbers(123456));
        //System.out.println(factorialOfNumber1.luckyNumbers());
//        System.out.println(factorialOfNumber1.beautySequence1());
//        System.out.println(factorialOfNumber1.beautySequence2());
//        System.out.println(factorialOfNumber1.beautySequence3());
//        System.out.println(factorialOfNumber1.beautySequence4());
//        System.out.println(factorialOfNumber1.beautySequence5());
//        System.out.println(factorialOfNumber1.fibonachiSequence(7));
        System.out.println(factorialOfNumber1.fibonachiSequence2());
        System.out.println(factorialOfNumber1.checkTheK(8));
        System.out.println(factorialOfNumber1.countOfDividers(8));
        System.out.println(factorialOfNumber1.maxDividersOfRange());
        System.out.println(factorialOfNumber1.threeDigitNumbers());

//        for (int i: factorialOfNumber1.numberDigitsList(25890)){
//            System.out.println(i);
//        }

        // --------------------------------------STRINGS---------------------------------------------------------------
//        String textString = new String(new char[]{' ', ' ', 'S', 'a', 't', ' ', 'e', 'n', 'i', ' ', 'a'});
//        String textString1 = "";
//        String textString2 = null;
//        System.out.println(textString);
//        char[] arrayChars = textString.toCharArray();
//        System.out.println(arrayChars[0]);
//        System.out.println(textString1.length());
//        System.out.println(textString1.isEmpty());
//        if (textString2 == null) System.out.println("String is null");
//        System.out.println(textString.concat(" ") + "is here");
//        System.out.println(textString.charAt(2));
//        System.out.println(textString.charAt(2));
//        System.out.println(textString.toLowerCase());
//        System.out.println(textString.toUpperCase());
//        System.out.println(textString.substring(4));
//        System.out.println(textString.substring(4, 6));
//        System.out.println(textString.trim());
//        System.out.println(textString);
//        String[] newString = textString.trim().split(" ");
//        for (String item : newString) System.out.println(item);
//        System.out.println(textString.replace('a', 'A'));
//        System.out.println(textString.indexOf('a', 5));
//        System.out.println(textString.startsWith("  S"));
//        System.out.println(textString.endsWith("a"));
//        System.out.println(textString == textString1);
//        System.out.println(textString.compareTo(textString1));
//        System.out.println(textString1.compareTo(textString));
//        System.out.println(textString.compareTo(textString));
//        StringBuffer stringBuffer = new StringBuffer("Hello Yerevan");
//        System.out.println(stringBuffer);
//        stringBuffer.append(".");
//        stringBuffer.insert(6, "my ");
//        System.out.println(stringBuffer.indexOf("my yerevan"));
//        System.out.println(stringBuffer);
//
//        //-------------------My homework about strings--------------------------------------
//
//        String homework = new String(new char[]{' ', 'i', 't', ' ', 'i', 's', ' ', 'm', 'y', ' ', 'h', 'o', 'm', 'e', 'w', 'o', 'r', 'k'});
//        System.out.println(homework);
//        char[] homeworkChars = homework.toCharArray();
//        System.out.println(arrayChars[0]);
//        System.out.println(homework.concat(" ") + "is here");
//        System.out.println(homework.charAt(2));
//        System.out.println(homework.toLowerCase());
//        System.out.println(homework.toUpperCase());
//        System.out.println(homework.substring(4));
//        System.out.println(homework.substring(4, 6));
//        System.out.println(homework.trim());
//        System.out.println(homework.replace('h', 'H'));
//        System.out.println(homework.indexOf('h', 5));
//        System.out.println(homework.startsWith(" "));
//        System.out.println(homework.endsWith("h"));

        //--------------------Collections-----------------------
//        ArrayList<String> testCollection = new ArrayList<>();
//        testCollection.add("Artur");
//        testCollection.add("Anna");
//        testCollection.add("Saten");
//        testCollection.add("Davit");
//        testCollection.add("Lilit");
//        System.out.println(testCollection);
//        testCollection.add(2, "Ani");
//        System.out.println(testCollection);
//        testCollection.set(2, "Narek");
//        System.out.println(testCollection);
//        testCollection.remove("Davit");
//        testCollection.remove(0);
//        System.out.println(testCollection);
//        for (String item: testCollection) System.out.println(item);
//        System.out.println(testCollection.contains("Gor"));
//        System.out.println(testCollection.get(2));
//        System.out.println(testCollection.size());
//        ArrayDeque<String> testCollection1=new ArrayDeque<>();
//        testCollection1.add("Artur");
//        testCollection1.add("Anna");
//        testCollection1.add("Saten");
//        testCollection1.add("Davit");
//        testCollection1.add("Lilit");
//        System.out.println(testCollection1.getFirst());
//        System.out.println(testCollection1.getLast());
//        System.out.println(testCollection1.peekLast());
//        System.out.println(testCollection1.pollLast());
//        System.out.println(testCollection1);
//        Map<String,Integer> ageMap=new HashMap<>();
//        ageMap.put("Artur",25);
//        ageMap.put("ArturK",30);
//        ageMap.put("Anna",30);
//        ageMap.put("Lianna",47);
//        ageMap.put("Karen",16);
//        System.out.println(ageMap);
//        System.out.println(ageMap.get("Anna"));
//        System.out.println(ageMap.remove("Anna"));
//        ageMap.replace("Karen",50);
//        System.out.println(ageMap);
//        for (Map.Entry<String,Integer> item: ageMap.entrySet()) System.out.println(item);
//        char chars[] = {'g' + 'n' + 'r'};
//        String s = new String(chars);
//        System.out.println(s);
//
//        char chars1[] = {65, 66, 67, 68, 69, 70};
//        String s1 = new String(chars1, 2, 3);
//        System.out.println(s1);
//        String s2 = new String(chars1);
//        System.out.println(s2);
//        System.out.println(s2.length());
//
//        String a = "four: " + 2 + 2;
//        String b = "four: " + (2 + 2);
//        System.out.println(a);
//        System.out.println(b);
//
//        Digits digits1 = new Digits(165);
//        System.out.println(digits1.counter(12));
//        System.out.println(digits1.temp);

        //System.out.println(factorialOfNumber1.numbersWithFourDigits());

        Auto mercedes = new Auto();
        Plane airbus = new Plane();
        Sheep oazis = new Sheep();
        Bus ikarus=new Bus("red");
        Bus ikarus1=new Bus("red");
        Bus scania=new Bus("silver",159);
        Auto man=new Bus(258);
        mercedes.breaking();
        airbus.breaking();
        oazis.breaking();
        System.out.println(ikarus.loading());
        ikarus.setSeatsCount(25);
        if (ikarus.getSeatsCount()<0) System.out.println("This count fo bus seats is incorrect");
        else  System.out.println(ikarus.getSeatsCount());
        scania.busCount=10;
        System.out.println(ikarus.busCount);
        ikarus.theChangeOfTransmission("a");
        Transmission transmission = new Transmission() {
            @Override
            public void theChangeOfTransmission(String type) {

            }
        };

        System.out.println(ikarus.hashCode());
        System.out.println(ikarus1.hashCode());
        System.out.println(ikarus.equals(ikarus1));
        String a="text";
        String b="text";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(b.equals(a));
        factorialOfNumber1.triangle();
    }
}

