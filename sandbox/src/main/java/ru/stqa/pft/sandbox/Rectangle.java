package ru.stqa.pft.sandbox;

/**
 * Created by Admin on 20.03.2016.
 */
public class Rectangle {
   public double x;
   public  double y;

  public Rectangle(double x, double y) {
    this.x= x;
    this.y = y;
  }
//
//  public double area () {
//   return this.a * this.b;
//  }

  public double distance(Rectangle p){
    return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
  }
}


