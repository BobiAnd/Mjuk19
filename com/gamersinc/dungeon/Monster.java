public class Monster{

private String name;
private int health ;


  public Monster (String name, int health ){
    if(health < 0 || health >100 ){
      System.out.println(name+ " Hp Out ouf bound choose between 0-100");
}else{
  this.health = health;
}
    this.name = name;

}
public Monster ( String name){
  this(name, 50);

}
public String getName(){
  return name;
}
public void setName(String Name) {
  this.name=name;
}
public int getHealth(){
  return health;
}
public void setHealth(int health){
  this.health=health;
}
public void monsterHealthlevel(){
  System.out.println(name+ " hase " + health +"HP left");
}

public void changeMonsterHealth(int h){
  if (h >100){
    this.health=health;

  }
else {
this.health=h;
}
}
public String toString(){
  return this.name + " hase " +  this.health + " HP...";
}
}
