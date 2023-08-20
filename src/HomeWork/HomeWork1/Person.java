package HomeWork.HomeWork1;

public class Person {
    String name;
    int age;
    double height;
    double weight;
    private int money;
    // kogda stavim privat to mojem ispolizovati peremenoi toliko v etom klasse

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public Person(int money) {
        this.money = money;

    }
    public void SchowInfo (){
        System.out.println("Name: " + name);
        System.out.println("Age: " +age + "years");
        System.out.println("Height: " + height + "M");
        System.out.println("Weight: " + weight + "KG");
    }
    public void GoWork() {
        if (age < 18 || age > 70 ) {
            System.out.println("Stay Home");
        }else {
            System.out.println("Go work ");
        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}