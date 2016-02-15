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
		int month = scanner.nextInt();
	}
}
