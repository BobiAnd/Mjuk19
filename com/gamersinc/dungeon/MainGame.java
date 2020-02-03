public class MainGame{

public static void main (String []args){

Monster m1 = new Monster("smurf");
Monster m2 = new Monster ("anka", 23);
Monster m3 = new Monster ("banka", 44);

//System.out.println(m1.getHealth());
//System.out.println(m2.getHealth());
//System.out.println(m3.getHealth());
m1.monsterHealthlevel();
m3.changeMonsterHealth(180);
System.out.println(m3.getHealth());
System.out.println(m1.toString());

CookieMonster cm1 = new CookieMonster("hugo");

System.out.println(cm1.toString());
cm1.eatCookie();
}
}
