package model;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Time implements  Formatibel{
private LocalDate date;
private LocalTime startTime;
private LocalTime endTime;
private String breakTime;

    public Time(LocalDate date, LocalTime startTime, LocalTime endTime, String breakTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.breakTime = breakTime;
    }

//TODO calculate projectTime
//convert the time entered by the user to a time stamp and then calculate the difference,





    @Override
    public String format() {
        return null;
        //TODO Print format
    }
}
