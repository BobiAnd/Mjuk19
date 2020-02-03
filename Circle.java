public class Circle extends Shape{

private double radius;

  public Circle(){

  }
public Circle (double radius){
  this.radius = radius;
}
public Circle (double radius, String color,boolean filled){
  this.radius = radius;
  super.setColor(color);
  super.setFilled(filled);
}

public double getRadius(){
  return radius;
}
public void setRadius(double radius){
this.radius = radius;
}
public double getArea(double r){
double sum =  Math.PI * Math.pow(r,2);
return sum;
}
public double  getPerimeter(double r){
 double sum = Math.PI * 2 * r;
return sum;
}
public String toString(){
  return "The radius is  "+ radius+" and the collor is " + super.getColor() +" and is it filled ? " + super.isFilled() ;
 }
}
