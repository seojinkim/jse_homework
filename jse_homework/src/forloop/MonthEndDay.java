package forloop;

import java.util.Scanner;

public class MonthEndDay {
	/**
	 * 월을 입력하면 해당 월의 끝날이 몇일인지 출력하는 프로그램
	 * 1을 입력하면 31일
	 * 단, 2월은 29일로 통일(윤년없음)
	 * 주의점.. 입력값이 1 ~ 12를 넘어서면 잘못된 입력
	 * switch case로 처리
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하면 해당 월의 끝날이 몇일인지 출력하는 프로그램");
		System.out.println("월을 입력하세요:");
		int month = scanner.nextInt();
		int result = 0;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = 31;
			break;
		case 2:
			result = 29;
			break;
		case 4: case 6: case 9: case 11:
			result = 30;
			break;
		default:
			System.out.println("잘못된 입력(1~12를 벗어난 입력)");
			break;
		}
		System.out.println("끝나는 날은 " + result +"입니다.");
	}
}
