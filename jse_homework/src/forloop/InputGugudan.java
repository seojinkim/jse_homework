package forloop;

import java.util.Scanner;

public class InputGugudan {
	/**
	 * 단수를 입력받아서 구구단을 출력함
	 * 예를 들어 2를 입력하면 2*1 ~ 2*9 = 18
	 * 9단까지 나오는 것이 아니라 100, 1000도 허용
	 * 단, 입력값이 0 또는 음수는 불허
	 * for loop....
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단수를 입력받아서 구구단을 출력함");
		System.out.println("단수를 입력하세요: ");
		int num = scanner.nextInt();
		if (num > 0) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));

			}
		} else {
			System.out.println("잘못된 입력 값(0또는 음수)");
		}
	}
}
