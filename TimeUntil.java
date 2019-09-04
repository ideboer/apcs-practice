import java.util.Scanner;
import java.time.LocalDateTime;

public class TimeUntil
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int hour_remainder, time_diff, hour_diff, minute_diff, second_diff, curr_time_in_sec, prop_time_in_sec, current_hour, current_minute, current_second, proposed_hour, proposed_minute, proposed_second;
        String proposed_time;
        
        System.out.println("Please input a time later today in the form of hh:mm:ss");
        proposed_time = scan.nextLine();

        proposed_hour = Integer.parseInt(proposed_time.substring(0, 2));
        proposed_minute = Integer.parseInt(proposed_time.substring(3, 5));
        proposed_second = Integer.parseInt(proposed_time.substring(6, 8));

        current_hour = LocalDateTime.now().getHour();
        current_minute = LocalDateTime.now().getMinute();
        current_second = LocalDateTime.now().getSecond();

        curr_time_in_sec = (current_hour * 3600) + (current_minute * 60) + (current_second);
        prop_time_in_sec = (proposed_hour * 3600) + (proposed_minute * 60) + (proposed_second);

        time_diff = prop_time_in_sec - curr_time_in_sec;

        hour_diff = time_diff / 3600;
        hour_remainder = time_diff % 3600;

        minute_diff = hour_remainder / 60;

        second_diff = minute_diff % 60;

        if ( (hour_diff > 0) && (minute_diff > 0) && (second_diff > 0) )
        {
            System.out.println(hour_diff + " hours, " + minute_diff + " minutes, and " + second_diff + " seconds.");
        }
        else if ( (hour_diff > 0) && (minute_diff > 0) )
        {
            System.out.println(hour_diff + " hours and " + minute_diff + " minutes" );
        }
        else if ( (hour_diff > 0) && (second_diff > 0) )
        {
            System.out.println(hour_diff + " hours and " + second_diff + " seconds" );
        }
        else if ( (minute_diff > 0) && (second_diff > 0) )
        {
            System.out.println(minute_diff + " minutes and " + second_diff + " seconds" );
        }
        else if ( (hour_diff > 0) )
        {
            System.out.println(hour_diff + " hours " );
        }
        else if ( (minute_diff > 0) )
        {
            System.out.println(minute_diff + " minutes and " );
        }
        else 
        {
            System.out.println(second_diff + " seconds");
        }

    }
}