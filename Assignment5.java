import java.util.*;
public class Assignment5
{
	public static void main(String[] args) {
	 boolean verify=isAuthorised() ;
	if(verify ) {
		System.out.println("Gongratulatons you passed");

	}else  {
		System.out.println("To bad. Good bye");
	}
	}
	  public static boolean isAuthorised() {
           int tryesLeft = 5;
while(tryesLeft>=1){
	  System.out.println("Enter 3 password keys:  ");
	  Scanner sc = new Scanner(System.in);
	  String input1 = sc.nextLine();
	  System.out.println("two more pleas!!!");
	  String input2 = sc.nextLine();
	  System.out.println("And the last one pleas!!!");
	  String input3 = sc.nextLine();

	  String a = "piggy";
	  String b = "snuff";
	  String c ="spark";
	  if ((input1.equals(a) || input1.equals(b) || input1.equals(c))
			  && (input2.equals(a) || input2.equals(b) || input2.equals(c))
			  && (input3.equals(a) || input3.equals(b) || input3.equals(c))
			  && (!input1. equals (input2) && !input1. equals (input3) && !input2. equals (input3))){
		  if(tryesLeft==1) System.out.println("That whas a cloes one");
		  return true;

			  }else{
			  tryesLeft--;
			  System.out.println("Wrong password  "  + tryesLeft+" Tryes left");
			  }
		}
		return false;
			  }

		}
