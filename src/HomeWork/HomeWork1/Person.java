package HomeWork.HomeWork1;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private double height;
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

    public Person() {

    }

    public void SchowInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "years");
        System.out.println("Height: " + height + "M");
        System.out.println("Weight: " + weight + "KG");
    }

    public void GoWork() {
        if (age < 18 || age > 70) {
            System.out.println("Stay Home");
        } else {
            System.out.println("Go work ");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && money == person.money && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", money=" + money +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight, money);
    }

    public void dieIn(int Yers) {
    }

    public abstract void dieIn();

    public void die() {
        System.out.println("Person are Dead");
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}