package com.seu.udo.domain.bean;

/**
 * Author: Jeremy Xu on 2016/4/11 11:13
 * E-mail: jeremy_xm@163.com
 */
public class StudyTime {
    private final String day;

    public StudyTime(String day) {
        this.day = day;
    }

    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Study time at " + day + " is: ");
        stringBuilder.append(hour + "hours ");
        stringBuilder.append(minute + "minutes ");
        stringBuilder.append(second + "seconds\n");

        return stringBuilder.toString();
    }
}
