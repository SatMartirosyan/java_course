package chapter2;

public class Digits {
    int temp = 0;

    Digits(int number) {
        temp = number;

    }

    public int counter(int number) {
        try {
            if (number >10) {
                throw new ArithmeticException("This is exception");
            } else {
                return 30 / number;
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        } catch (RuntimeException e) {
            System.out.println(e);
            return -2;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        } finally {
            System.out.println("This is finally work");
        }
    }



}

