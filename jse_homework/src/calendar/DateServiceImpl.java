package calendar;

public class DateServiceImpl implements DateService {

	@Override
	public String getEndOfMonth(int year, int month) {
		String result="";
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = "31일";
			break;
		case 2:
			result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "29일" : "28일";
			break;
		case 4: case 6: case 9: case 11:
			result = "30일";
			break;
		default:
			System.out.println("잘못된 입력(1~12를 벗어난 입력)");
			break;
		}
		return result;
	}
}
