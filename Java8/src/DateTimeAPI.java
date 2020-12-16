import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date.plusMonths(1));
		
		
		
		System.out.println(date.format(DateTimeFormatter.ofPattern("d:MMM:uuuu")));
		System.out.println(date.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		
		
//		String date="2020-12-16";
//		DateTimeFormatter dateTimeException = DateTimeFormatter.ofPattern("yyyy MM dd"); 
//		LocalDate localDate = LocalDate.parse(date);
//		System.out.println(localDate);
	}

}
