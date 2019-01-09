package com.bostonbyte.runner;

import java.sql.Date;
import java.util.Calendar;

public class CalendarDemo {
   public static void main(String[] args) {

      // create a calendar
      Calendar cal = Calendar.getInstance();

      // get the current time
      System.out.println("Current time is :" + cal.getTime());

      // create new date and set it
      Date date = new Date(System.currentTimeMillis());
      cal.setTime(null);
      //cal.setTime(date);

      // print the new time
      System.out.println("After setting Time:  " + cal.getTime());
   }
   
   
   
   
   public static boolean dateEquals(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		if (date1 != null && date2 != null) {
			cal1.setTime(date1);
			cal2.setTime(date2);
		} else {
			return false;
		}
		
		return cal1.equals(cal2); 
	}
}