import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	
	public static String getDate(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}
	
	
	
	
	public static int getFirstDayOfWeek(int year,int month) throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE, 1);
		return cal.get(Calendar.DAY_OF_WEEK)-1;
	}
	
	
	
	
	public static int getLastDay(int year,int month) throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);		
	}
	
	
	
	
	public static long getDiffOfDates (String begin,String end) throws Exception{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = formatter.parse(begin);
		Date endDate = formatter.parse(end);

		long diff = endDate.getTime() - beginDate.getTime();
		long diffDays = (diff / (24 * 60 * 60 * 1000));
		 
		return diffDays;
	}
	
}
