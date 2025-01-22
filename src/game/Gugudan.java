package game;

public class Gugudan {
	Gugudan() {

	}

	public void gugudan() {
		int result = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				result = i * j;
				System.out.println(i + "*" + j + "=" + result);
			}
		}
	}
}
