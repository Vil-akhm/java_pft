package ru.stqa.pft.sandbox;

public class MyFP {

    public static void main(String[] args) {
       hello();
   //     hello("user");

        double len =5;
        System.out.println(area(len));

        double a= 3;
        double b =4;
        System.out.println(area(a,b));
    }

 public static void hello() {
     System.out.println("Hello");
 }


    public static double area( double l){
        return l*l;
    }

    public static double area (double a,double b){
        return a*b;
    }
}