package com.home.erwin.homework.Model;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erwin on 03.10.2016.
 */

public class School {

    private String name;
    private Weekday day;
    private String color;
    private List<SchoolClass> classes;

    public School(String name, Weekday day, String color) {
        this.name = name;
        this.day = day;
        this.color = color;
        this.classes = new ArrayList<SchoolClass>();
    }

    public School(String name, Weekday day, String color, List<SchoolClass> classes) {
        this.name = name;
        this.day = day;
        this.color = color;
        this.classes = classes;
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

    public List<SchoolClass> getClasses() {
        return classes;
    }

    public void setClasses(List<SchoolClass> classes) {
        this.classes = classes;
    }
}
