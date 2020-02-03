public class MainShape{
  public static void main(String[]args){

Circle c1 = new Circle(4);
Square s1 = new Square(5);
Rectangle r1 = new Rectangle(5,8);
Shape c2 = new Circle();
Shape s2 = new Square();
Shape r2 = new Rectangle();
Circle c3 = new Circle(4,"red",true);
Square s = new Square(5,"yellow", false);
System.out.println(s.toString());
System.out.println(c1.toString());
System.out.println(s1.toString());
System.out.println(r1.toString());
System.out.println(c2.toString());
System.out.println(s2.toString());
System.out.println(r2.toString());
System.out.println(c3.toString());







  }
}
