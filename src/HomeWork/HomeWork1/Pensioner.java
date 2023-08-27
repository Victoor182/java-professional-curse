package HomeWork.HomeWork1;

public class Pensioner extends Person {
    private double pension;


    @Override
    public void die() {
        double earnedPension = (getAge() - 50) * pension;
        System.out.println("This Man die but he was won: " + earnedPension);
    }

}
