import java.time.ZonedDateTime;
	import java.time.format.DateTimeFormatter;


public class SimpleDateDemo {
	
	public static void main(String[] args) {
	    ZonedDateTime now = ZonedDateTime.now();
	    System.out.println(now);
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	    String formattedDate = formatter.format(now);
	    System.out.println(formattedDate);
	}

}
