import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the date DD/MM/YYYY Format:-");
        String date= sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("DD/MM/YYYY");
        LocalDate date1=LocalDate.parse(date,formatter);
      //  LocalDate FirstDateOfWeek =date1.with(TemporalAdjuster.previousOrSame(DayOfWeek.MONDAY));
       // LocalDate LastDateOfWeek =date1.with(TemporalAdjuster.previousOrSame(DayOfWeek.SUNDAY));
      //  System.out.println("first date of week"+FirstDateOfWeek.format(formatter));
       // System.out.println("last date of week"+LastDateOfWeek.format(formatter));
        
    }
}
