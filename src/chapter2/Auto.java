package chapter2;

public class Auto extends Transport implements Transmission,Engine{
    @Override
    public void breaking() {
        System.out.println("Stop");
    }

    @Override
    public String loading() {
        return "Loading";
    }

    @Override
    public void theChangeOfTransmission(String type) {
        System.out.println("the change has been done");
    }
}
