package ru.stqa.pft.sandbox;

/**
 * Created by Admin on 20.03.2016.
 */
public class Square {
  public double l;

  public Square (double l) {
    this.l = l;
  }

  public double area(){
    return this.l*this.l;
  }
}
