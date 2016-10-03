package com.home.erwin.homework.Model;

import java.util.Date;

/**
 * Created by Erwin on 03.10.2016.
 */

public class Homework extends Entry {

    public enum Priority {
        LOW, NORMAL, HIGH
    }

    private Priority priority;

    public Homework(String title, String description, Date duedate, School school, Priority priority) {
        super(title, description, duedate, school);
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
