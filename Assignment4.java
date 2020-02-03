import java.util.*;
public class Assignment4{

  public static void main (String[]args){

	  int returnNumber1= (getInt());
	  int returnNumber2=(getInt());
int returnAvrage = getAvrage(returnNumber1,returnNumber2);


System.out.println(returnAvrage);



  }
public static int getInt(){
Scanner sc=new Scanner(System.in);
System.out.println("Type in a number");
int input= sc.nextInt();
return input;
}

public static int getAvrage(int num1,int num2) {
int sum= num1 + num2;
	return sum/2;

}
}
