package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LocalDate today=LocalDate.now();
     System.out.println("Current Date :"+today);
     
     LocalTime time=LocalTime.now();
     System.out.println("Current Time :"+time);
     
     LocalDateTime today1=LocalDateTime.now();
     System.out.println("Current DateTime :"+today1);
     
     
     LocalDate firstDay_2023 = LocalDate.of(2002, Month.AUGUST, 20);
     System.out.println("Specific Date="+firstDay_2023);
	}

}
