package ru.stqa.pft.sandbox;

import java.util.concurrent.RecursiveAction;

public class MyFP {

    public static void main(String[] args) {
   //     hello("user");

        Square s = new Square(5); // создается оъект типа Square
        System.out.println("площадь квадрата со стороной " + s.l + " = " + s.area());


        Rectangle r = new Rectangle(3, 4);
        System.out.println("площадь прямуогольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }





}