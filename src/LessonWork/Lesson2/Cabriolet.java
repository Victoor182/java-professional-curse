package LessonWork.Lesson2;


import LessonWork.Lesson1.Car;

public class Cabriolet extends Car {

    public boolean isOpened;

    public Cabriolet(int id, String model , String color, int currentSpeed, boolean isOpened){
        super(id, model,color,currentSpeed);
        this.isOpened=isOpened;
    }
}
