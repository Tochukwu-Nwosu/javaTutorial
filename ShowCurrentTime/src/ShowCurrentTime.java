public class ShowCurrentTime {

	public static void main(String[] args) {
		
		long totalMilliseconds = System.currentTimeMillis(); //totalMilliseconds
		
		long totalSeconds = totalMilliseconds / 1000; //totalSeconds
		
		byte currentSecond = (byte)(totalSeconds % 60); //currentSecond*
		
		long totalMinute = totalSeconds / 60; //totalMinute
		
		byte currentMinute = (byte)(totalMinute % 60); //currentMinute*
		
		long totalHours = totalMinute / 60; //totalHours
		
		byte currentHour = (byte)(totalHours % 24); //currentHour*
		
		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
}