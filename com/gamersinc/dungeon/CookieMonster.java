public class CookieMonster implements CookieConsumer{

public CookieMonster(String name, int health){
  super(name,health);

}
public CookieMonster(String name){
  super(name,50);
}
public void eatCookie(){
  System.out.println("yummie yummie");
}
}
