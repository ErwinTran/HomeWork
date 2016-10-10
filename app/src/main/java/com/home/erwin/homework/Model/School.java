package com.home.erwin.homework.Model;

import android.graphics.Color;

/**
 * Created by Erwin on 03.10.2016.
 */

public class School {

    private String name;
    private Weekday day;
    private String color;

    public School(String name, Weekday day, String color) {
        this.name = name;
        this.day = day;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day.getString();
    }

    public String getColor() {
        return "#" + color.toUpperCase();
    }

    public void setColor(String color) {
        this.color = color;
    }


}
