package 第一次作业;

public class ShowCurrentTime {
	public static void main(String[] args) {
		long totalMilliseconds =System.currentTimeMillis();
		long tatalSeconds=totalMilliseconds/1000;
		long currentSecond = tatalSeconds % 60;
		long totalMinutes = tatalSeconds / 60;
		long currentMinute=totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("Current time is " + currentHour + ":" + currentMinute +":"+currentSecond+"GMT");
		
		
	}
	

}
