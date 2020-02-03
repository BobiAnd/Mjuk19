
public class Assignment7 {
	public static void main(String[] args) {
		boolean bobiHasBigPenis= true;
		boolean bobiIsOverWeight= true;
		boolean bobiLikesVegetables=false;
		boolean bobiEatsFish=true;
		boolean verifyedIfTrue = anyIsTrue(bobiHasBigPenis,bobiIsOverWeight,bobiLikesVegetables,bobiEatsFish);
		boolean verifyIfFalse = allAreFalse(bobiHasBigPenis,bobiIsOverWeight,bobiLikesVegetables,bobiEatsFish);
		System.out.println(verifyedIfTrue);
		System.out.println(verifyIfFalse);
	}
public static boolean anyIsTrue(boolean a,boolean b, boolean c,boolean d) {
	if(a||b||c||d) {
		return true;
	}
	else return false;
}
public static boolean allAreFalse(boolean a,boolean b, boolean c,boolean d) {
	if(a||b||c||d) {
		return !true;
	}
	else return !false;
}
}
