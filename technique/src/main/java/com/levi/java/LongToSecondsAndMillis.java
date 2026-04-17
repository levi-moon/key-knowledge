package com.levi.java;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * long类型转为秒及毫秒
 *
 * @author Levi
 * @since 2024/9/4 9:38:12
 */
@Slf4j
public class LongToSecondsAndMillis {

    public static void main(String[] args) {
        long duration = 1234567890; // 假设这是一个时间长度（单位：毫秒）

        /*// 转换为秒
        long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
        // 获取剩余的毫秒数
        long millis = duration - TimeUnit.SECONDS.toMillis(seconds);

        System.out.println("Seconds: " + seconds);
        System.out.println("Milliseconds: " + millis);*/

        // ========================================

        // 转为天
        long days = TimeUnit.MILLISECONDS.toDays(duration);
        log.info("天：{}", days); // 天：14

        // 转为时
        long hours = duration - TimeUnit.DAYS.toMillis(days);
        long hoursResult = TimeUnit.MILLISECONDS.toHours(hours);
        log.info("时：{}", hoursResult); // 时：6

        // 转为分
        long minutes = hours - TimeUnit.HOURS.toMillis(hoursResult);
        long minutesResult = TimeUnit.MILLISECONDS.toMinutes(minutes);
        log.info("分：{}", minutesResult); // 分：56

        // 转为秒
        long seconds = minutes - TimeUnit.MINUTES.toMillis(minutesResult);
        long secondsResult = TimeUnit.MILLISECONDS.toSeconds(seconds);
        log.info("秒：{}", secondsResult); // 秒：7

        // 转为毫秒
        long mills = seconds - TimeUnit.SECONDS.toMillis(secondsResult);
        long millsResult = mills >= 0 ? TimeUnit.MILLISECONDS.toMillis(mills) : 0;
        log.info("毫秒：{}", millsResult); // 毫秒：890

        log.info("{}天{}时{}分{}秒{}毫秒", days,hoursResult,minutesResult,secondsResult,millsResult); // 14天6时56分7秒890毫秒

        long result = (days * 24 * 60 * 60 + hoursResult * 60 * 60 + minutesResult * 60 + secondsResult) * 1000 + millsResult;
        System.out.println(result); // 1234567890
    }
}
