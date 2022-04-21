package chapter2;

public class Sheep extends Transport{
    @Override
    public void breaking() {
        System.out.println("Get to the beach");
    }

    @Override
    public String loading() {
        return null;
    }
}
