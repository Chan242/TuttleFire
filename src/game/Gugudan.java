package game;

public class Gugudan {
	Gugudan() {

	}

	public void gugudan() {
		int result = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				result = (i+1) * (j+1);
				System.out.print((i+1) + "*" + (j+1) + "=" + result+"\t"); 
			}
			System.out.println();
		}
	}
}
