package com.home.erwin.homework.Model;

/**
 * Created by Erwin on 08.10.2016.
 */

public enum Weekday {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");

    private String output;

    private Weekday(String output) {
        this.output = output;
    }

    public String getString() {
        return output;
    }
}
