package gbData;

public class gameField_test {
	public static void main(String[] args) {
		
		System.out.println("gameField wird getestet");
		
		gameToken tokenB = new tokenBlack();
		gameToken tokenW = new tokenWhite();
		gameField myField = new gameField();
		myField.putStone(10, 10, tokenB);
		myField.putStone(11, 10, tokenB);
		myField.putStone(12, 10, tokenB);
		myField.putStone(9, 10, tokenB);
		myField.putStone(8, 10, tokenB);
		
		//System.out.println(myField.getWin(10, 10, tokenB));
		
		
		System.out.println(myField.getSize()); 		//19
		System.out.println(myField.putStone(15, 14, tokenB)); //e
		System.out.println(myField.putStone(15, 14, tokenB)); //b
		System.out.println(myField.putStone(15, 14, tokenW)); //b
		
		System.out.println(myField.putStone(-1, 1, tokenB));	//f
		System.out.println(myField.putStone(0, 0, tokenB));		//f
		System.out.println(myField.putStone(19,19, tokenW));	//e
		System.out.println(myField.putStone(20,15,tokenW)); 	//f
		System.out.println(myField.putStone(15,20, tokenW));	//f
		System.out.println(myField.putStone(20,20, tokenW));	//f*/
		System.out.println(myField.remove(5, 7)); //r
		System.out.println(myField.remove(19, 20));
		
		
		
		
	}

}
