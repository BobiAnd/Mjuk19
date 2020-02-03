public class Rectangle extends Square{

  private double width;
  private double lenght;

    public Rectangle  (){

    }
  public Rectangle (double width, double lenght){
    this.width = width;
    this.lenght = lenght;
  }
  public Rectangle (double width, double lenght, String color,boolean filled){
    this.width = width;
    this.lenght = lenght;
    super.setColor (color);
    super.setFilled (filled);
  }

  public double getWidth(){
    return width;
  }
  public void setWidth(double width){
  this.width = width;
  }

  public double getLenght(){
    return lenght;
  }
  public void setLenght(double lenght){
  this.lenght = lenght;
  }



  public double getArea(){
  double sum =  lenght * width;
  return sum;
  }
  public double  getPerimeter(){
   double sum = lenght *2 +width *2;
    return sum;
  }
  public String toString(){
    return "The the width is  "+width+" and the length is "+lenght+" and the collor is " +  super.getColor() +" and is it filled ? " + super.isFilled();

   }

  }
