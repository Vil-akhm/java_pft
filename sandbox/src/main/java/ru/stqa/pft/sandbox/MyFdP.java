package ru.stqa.pft.sandbox;

import java.util.concurrent.RecursiveAction;

public class MyFdP {

    public static void main(String[] args) {
        //     hello("user");

    //   Square s = new Square(5); // создается оъект типа Square
    //   System.out.println("площадь квадрата со стороной " + s.l + " = " + s.area());


                   Rectangle p1 = new Rectangle(2, 4);
                   Rectangle p2 = new Rectangle(5, 7);


             System.out.println(distance(p1,p2));
          }


    public static double distance(Rectangle p1,Rectangle p2){
        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
    }


    }
