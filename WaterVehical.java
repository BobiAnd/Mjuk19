import java.util.random;
public abstract class WaterVehicle extends Vehicle{
  Random rand = new Random();
  int n = rand.nextInt(50) + 1;
public void Dock(){
  int fuel =100;
  checkDepth();
}
public void checkDepth(){
  System.out.println("your current depth is "+ n + " meters")
}
}
