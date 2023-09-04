package HomeWork.HomeWork1;

import java.util.Objects;

public abstract class Pensioner extends Person {
    private double pension;


    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public void dieIn(int years) {
        System.out.println("Этот пенсионер умрет через" + years + "лет");
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pensioner pensioner)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(pensioner.pension, pension) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pension);
    }

    @Override
    public void die() {
        double earnedPension = (getAge() - 50) * pension;
        System.out.println("This Man die but he was won: " + earnedPension);
    }

}
