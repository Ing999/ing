package 第五次作业;
import java.util.GregorianCalendar;
public class Question5 {
	public static void main(String[] args){
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(calendar.YEAR) + ":" + calendar.get(calendar.MONTH) + ":" + calendar.get(calendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(calendar.YEAR) + ":" + calendar.get(calendar.MONTH) + ":" + calendar.get(calendar.DAY_OF_MONTH));
    }

}
