package chapter2;

public class Plane extends Transport{
    @Override
    public void breaking() {
        System.out.println("Grounding");
    }

    @Override
    public String loading() {
        return null;
    }
}
