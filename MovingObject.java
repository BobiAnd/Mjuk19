public abstract class MovingObject{




public abstract void move (int houers){
if (houers <=0){
  System.out.println("Low on fuel can not move")
while houers <=50{
  distansTravelled+10;
fuel -10;
}
  else if houers >50 && houers <100{
    distansTravelled -20;
    fuel-20;
  }
else distansTravelled-30;
fuel-30;
}
