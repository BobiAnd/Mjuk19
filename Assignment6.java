
public class Assignment6 {

	public static void main(String[] args) {
		boolean bobiHasBigPenis= true;
		boolean bobiIsOverWeight= true;
		boolean bobiLikesVegetables=false;
		boolean bobiEatsFish=true;
		boolean verifyedIfTrue = anyIsTrue(bobiHasBigPenis,bobiIsOverWeight,bobiLikesVegetables,bobiEatsFish);
	System.out.println(verifyedIfTrue);
	}
public static boolean anyIsTrue(boolean a,boolean b, boolean c,boolean d) {
	if(a||b||c||d) {
		return true;
	}
	else return false;
}
}
