package game;

public class Dice {

int diceNum = 0;
	
	void dice() {
		diceNum = (int)(Math.random()*6)+1;
		System.out.println(diceNum);
		
	}
	
}
