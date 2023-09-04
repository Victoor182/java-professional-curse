package LessonWork.Lesson1;

import java.util.Objects;

public class Car {
    int id;
    String model;

    String color;

    int currentSpeed;

    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }


    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed < 500) {
            this.currentSpeed = currentSpeed;
        } else
            System.out.println("speed was no chenge ");

    }


    public Car(int id, String model, String color, int currentSpeed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public void drift() {
        System.out.println("super cool drift");
    }

    public void info() {
        System.out.println();
        System.out.println("info auto");
        System.out.println("id nr = " + id);
        System.out.println("model auto = " + model);
        System.out.println("color auto = " + color);
        System.out.println();
    }

    public void go(int speed) {
        if (currentSpeed == 0) {
            System.out.println("auto was start with speed " + speed);
        } else {
            System.out.println("auto still go with " + speed);
        }
        currentSpeed = speed;

    }

    public void reuction(int a) {
        int b = cost - cost * a / 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && currentSpeed == car.currentSpeed && cost == car.cost && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }


}
