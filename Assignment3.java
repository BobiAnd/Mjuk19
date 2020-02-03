import java.util.Scanner;

public class Assignment3 {
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
String input1;
String input2 ;
do{
System.out.println("type in a text");
input1=sc.nextLine();
System.out.println("Du skrev " + input1);
System.out.println("type in a text");
input2=sc.nextLine();
}while (!input1.equalsIgnoreCase(input2));



if (input1.equals(input2)){
System.out.println("du skrev samma sak 2 gånger ");
}

else{input1.equalsIgnoreCase(input2);
System.out.println( "Förutom storleken skrev du samma sak 2 gånger");

}



}
}
