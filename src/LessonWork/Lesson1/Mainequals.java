package LessonWork.Lesson1;




public class Mainequals {
    public static void main(String[] args) {
        Car bmw = new Car(1,"BMW","black",0);
        Car volvo = new Car(2,"Volvo","white",0);
        Car volvo2 = new Car(2,"Volvo","white",0);

        System.out.println(volvo.equals(volvo2));
        System.out.println(bmw.equals(bmw));

        System.out.println(bmw.equals(volvo));
    }


    }
