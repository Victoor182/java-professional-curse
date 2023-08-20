package LessonWork.Lesson1;

public class Car {
    int id ;
    String model ;

    String color ;

    int currentSpeed;

    public Car(int id, String model, String color, int currentSpeed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public void drift (){
        System.out.println("super cool drift");
    }
    public void info (){
        System.out.println();
        System.out.println("info auto");
        System.out.println("id nr = " + id);
        System.out.println("model auto = " + model);
        System.out.println("color auto = " + color);
        System.out.println();
    }
    public void go(int speed){
        if (currentSpeed == 0) {
            System.out.println("auto was start with speed " + speed);
        }
        else {
            System.out.println("auto still go with " + speed);
        }
        currentSpeed = speed ;

    }

}
