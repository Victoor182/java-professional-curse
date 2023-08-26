package LessonWork.Lesson1;

import LessonWork.Lesson2.Cabriolet;

public class Main {
    public static void main(String[] args) {
        Car a = new Car(1,"BMW F34","Black",0);
        Car b  = new Car(2,"Tesla X","Red",0);


        a.id = 1;
        b.id = 2;

        a.model = "BMW F34";
        b.model = "TESA X";

        a.color = "Black";

        //System.out.println(a.id);
        //System.out.println(b.id);
//
        //System.out.println(a.model);
        //System.out.println(b.model);
//
        //System.out.println(a.color);
        //System.out.println(b.color);
        a.drift();
        b.drift();
        a.info();
        b.info();
        a.go(25 );

        Car car = new Car (1,"BMW","blue",0);
        Cabriolet cabriolet = new Cabriolet(1,"bmw","black",0,true);
    }
}