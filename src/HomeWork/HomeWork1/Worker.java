package HomeWork.HomeWork1;

import java.util.Objects;

public abstract class Worker extends Person {
    private int minSalary;
    private int maxSalary;


    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Worker(int money, int minSalary) {
        super(money);
        this.minSalary = minSalary;
    }

    public Worker(String name, int age, double height, double weight, int minSalary, int maxSalary) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Worker(int minSalary) {
        this.minSalary = minSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker worker)) return false;
        if (!super.equals(o)) return false;
        return minSalary == worker.minSalary && maxSalary == worker.maxSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minSalary, maxSalary);
    }

    @Override
    public void dieIn(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + "лет");
    }

    @Override
    public void die() {
        System.out.println("This man didn't live to see his retirement. ");

    }

}

