package com.home.erwin.homework.Model;

import java.util.Date;

/**
 * Created by Erwin on 03.10.2016.
 */

public abstract class Entry {

    private String title;
    private String description;
    private Date duedate;
    private School school;

    public Entry(String title, String description, Date duedate, School school) {
        this.title = title;
        this.description = description;
        this.duedate = duedate;
        this.school = school;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
