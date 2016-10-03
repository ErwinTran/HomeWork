package com.home.erwin.homework.Model;

/**
 * Created by Erwin on 03.10.2016.
 */

public class School {

    public enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    private String name;
    private WeekDay day;

    public School(String name, WeekDay day) {
        this.name = name;
        this.day = day;
    }

    public School(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeekDay getDay() {
        return day;
    }

    public void setDay(WeekDay day) {
        this.day = day;
    }

}
