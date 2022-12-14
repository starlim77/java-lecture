package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		System.out.println("오늘 날짜 : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : "+sdf.format(date));
		System.out.println();
		
		//내 생일 - 1991 07 15 10:35:15 입력
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910715103515");  // String -> Data변환 객체는 기본형으로 casting되지 않는다
		
		System.out.println(birth);
		System.out.println(sdf.format(birth));
		System.out.println();
		
		//Calendar cal = new Calendar(); - error
		
		//기준이 시스템의 날짜, 시간
		//Calendar cal = new GregorianCalendar(); //Sub Class 이용하여 생성
		Calendar cal = Calendar.getInstance(); //메소드를 이용하여 생성
		
		//기준을 캐나다로 변경
		//Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
		
//		int year = cal.get(1);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//1월-0, 2월-1,....
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);//일-1, 월-2, 화-3, 
		String dayOfWeek=null;
		switch(week) {
		case 1 : dayOfWeek="일";break;
		case 2 : dayOfWeek="월";break;
		case 3 : dayOfWeek="화";break;
		case 4 : dayOfWeek="수";break;
		case 5 : dayOfWeek="목";break;
		case 6 : dayOfWeek="금";break;
		case 7 : dayOfWeek="토";
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year+"년 "+month+"월 "+day+"일 "+dayOfWeek+"요일 "+hour+":"+minute+":"+second);
		
	}
	
}
