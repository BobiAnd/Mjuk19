public class MainDator {

public static void main(String []args){

  Computer c1 = new Computer();
  PC p1 =new PC();
  Computer p2 =new PC();
  Macintosh m1 =new Macintosh();
Computer m2 = new Macintosh();

  c1.printYourInventor();
  System.out.println("-----------------------------------------------");
  p1.printYourInventor();
    System.out.println("-----------------------------------------------");
  p2.printYourInventor();
    System.out.println("-----------------------------------------------");
  m1.printYourInventor();
    System.out.println("-----------------------------------------------");
  m2.printYourInventor();
    System.out.println("-----------------------------------------------");

  m1.smash();
}
}
