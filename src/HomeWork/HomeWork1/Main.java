package HomeWork.HomeWork1;

public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person("Jhon", 31, 1.75, 75.5);
        Person Person2 = new Person("Sofia", 18, 1.65, 45);
        Person Person3 = new Person("Maria", 25, 1.72, 55);
        Person Person4 = new Person("Alex", 42, 1.80, 95);
        Person Person5 = new Person(500);
        Person5.setMoney(4850);
        System.out.println(Person5.getMoney());
    }
}