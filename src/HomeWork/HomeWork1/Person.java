package HomeWork.HomeWork1;

public class Person {
   private String name;
     private  int age;
  private   double height;
    private double weight;
    private int money;
    // kogda stavim privat to mojem ispolizovati peremenoi toliko v etom klasse

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public Person(int money) {
        this.money = money;

    }
    public Person(){

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

    public void die(){
        System.out.println("Person are Dead");
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}