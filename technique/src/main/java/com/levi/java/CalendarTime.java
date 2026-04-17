package com.levi.java;

import java.util.Calendar;

/**
 * @Class: CalendarTime
 * @Description: 试验calendar的用法
 * @Author: Levi
 * @Date: 2026/3/27 09:02
 * @Version: 1.0
 */
public class CalendarTime {

    public Calendar getCalendar(){
        Calendar calendar = Calendar.getInstance();
        // 将时间调整为 01:15:00（小时、分钟、秒），日期保持不变
        calendar.set(11, 1);    // 设置小时为1（24小时制）
        calendar.set(12, 15);   // 设置分钟为15
        calendar.set(13, 0);    // 设置秒数为0
        // 在原有日期基础上加1天
        calendar.add(5,1); // 字段5对应DATE（日期）
        return calendar;
    }

    public static void main(String[] args) {
        CalendarTime calendarTime = new CalendarTime();
        System.out.println(calendarTime.getCalendar().getTime());
    }
}
