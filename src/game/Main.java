package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dice dice = new Dice();
		Gugudan gugudan = new Gugudan();
		OddEven oe = new OddEven();
		int input = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.구구단/2.홀짝/3.주사위 숫자. 원하시는 기능을 선택하세요");
		input = sc.nextInt();
		if (input == 1) {
			gugudan.gugudan();
		}else if (input == 2) {
			dice.dice();
		}else if (input == 3) {
			oe.oe();
		}else if (input >= 4||input == 0) {
			System.out.println("잘못된 입력입니다. 프로그램을 종료합니다....");
		}
		
	}

}
