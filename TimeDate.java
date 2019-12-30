import java.time.LocalDate;
import java.time.LocalTime;
class TimeDate
{	
	 public static void main(String[] args)
	{ 
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		System.out.println(date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		
	}
}