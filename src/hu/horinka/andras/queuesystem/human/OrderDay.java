package hu.horinka.andras.queuesystem.human;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class OrderDay {
    DayOfWeek weekday;
    LocalTime startTime;
    LocalTime endTime;

    public OrderDay(DayOfWeek weekday, LocalTime startTime, LocalTime endTime) {
        this.weekday = weekday;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public DayOfWeek getWeekday() {
        return weekday;
    }

    public void setWeekday(DayOfWeek weekday) {
        this.weekday = weekday;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
