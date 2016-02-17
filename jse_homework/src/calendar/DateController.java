package calendar;

import java.util.Scanner;

public class DateController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateService service = new DateServiceImpl();
		while(true){
			System.out.println("=== 날짜 프로그램 ===");
			System.out.println("[메뉴] \n 1.해당년월의 마지막 날 구하기 \n 9.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("연도를 입력하세요: ");
				int year = scanner.nextInt();
				System.out.println("월을 입력하세요: ");
				int month = scanner.nextInt();
				String result = service.getEndOfMonth(year, month);
				if (!"".equals(result)) {
					System.out.println(year + "년 " + month + "월의 끝나는 날은 " + result + "입니다.");
				}
				break;
			case 2:
				break;
			default:
				break;
			}
		}
	}
}
