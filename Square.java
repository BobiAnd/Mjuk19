public class Square extends Shape{

  private double side;


    public Square(){

    }
  public Square (double side){
    this.side = side;

  }
  public Square (double side, String color,boolean filled){

    this.side = side;
    super.setColor (color);
    super.setFilled  (filled);
  }

  public double getside(){
    return side;
  }
  public void setWidth(double side){
  this.side = side;
  }





  public double getArea(){
  double sum =  side * side;
  return sum;
  }
  public double  getPerimeter(){
   double sum = side *2 +side *2;
   return sum;
  }
  public String toString(){
    return  "The side is  "+ side+" and the collor is " + super.getColor() + " and is it filled  " + super.isFilled();
  }
   }
