package HomeWork.HomeWork1;

public class Worker extends Person {
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


    @Override
    public void die() {
        System.out.println("This man didn't live to see his retirement. ");

    }
}

