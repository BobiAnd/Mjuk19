public class Shape {

private String color;
private boolean filled;

public Shape(){

}
public Shape (String color, boolean filled ){
  this.color = color;
  this.filled = filled;
}


public String getColor(){
  return color;
}
public void setColor(String color){
this.color=color;
}

public boolean isFilled(){
  return filled;
}
public void setFilled(boolean filled ){
this.filled = filled;
}
public double getArea(double a, double b){
  double sum =  a * b;
  return sum;
}
public double getPerimeter(double a, double b){
   double sum = a *2 + b *2;
return sum;
}
public String toString(){
    return "The collor is " + color +" and is it filled ? " +  filled;
}
}
