import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
	  public static void main(String[] args) {  
		    LocalDate myDateObj = LocalDate.now();  
		    System.out.println("Before formatting: " + myDateObj);  
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		    
		    String formattedDate = myDateObj.format(myFormatObj);  
		    System.out.println("After formatting: " + formattedDate);  
		  
	 
	      LocalDate date1 = LocalDate.of(2017, 1, 13);    
	      System.out.println(date1.isLeapYear());    
	      LocalDate date2 = LocalDate.of(2016, 9, 23);    
	      System.out.println(date2.isLeapYear());    
	    
	      
	    
}
}
