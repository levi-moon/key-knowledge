package com.levi.java;

import java.util.Timer;

/**
 * @Class: TimerSchedule
 * @Description: java原生定时器
 * @Author: Levi
 * @Date: 2026/3/27 09:50
 * @Version: 1.0
 */
public class TimerSchedule {

    public static void main(String[] args) {
        Timer timer = new Timer(true);
        CalendarTime calendarTime = new CalendarTime();
        timer.schedule(null, calendarTime.getCalendar().getTime(), 8640000L);
    }
}
