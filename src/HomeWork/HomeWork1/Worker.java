package HomeWork.HomeWork1;

public class Worker extends Person{
    private int minSalary;
    private int maxSalary;

    @Override
    public void die() {
        System.out.println("This man didn't live to see his retirement. ");
        super.die();
    }
}

