package chapter2;

public class Bus extends Auto {
    String color = "";
    int winCode;
    static int busCount = 0;

    public int getSeatsCount() {
        if (seatsCount == 8) {
            //System.out.println("This count fo bus seats is incorrect");
            return -1;
        } else return seatsCount;
    }

    private int seatsCount = 8;

    Bus(String color) {
        this.color = color;
    }

    Bus(int winCode) {
        this.winCode = winCode;
    }

    public Bus(String color, int winCode) {
        this.color = color;
        this.winCode = winCode;
    }

    @Override
    public void breaking() {
        super.breaking();
        System.out.println("Soft stop");
    }

    public boolean breaking(int vel) {
        return true;
    }

    public String loading() {
        return super.loading() + " Return";
    }


    public void setSeatsCount(int seatsCount) {
        if (seatsCount >= 8 && seatsCount <= 50) this.seatsCount = seatsCount;
        else System.out.println("Incorrect count of seats");
    }


}
