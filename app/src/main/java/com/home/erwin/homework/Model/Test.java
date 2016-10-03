package com.home.erwin.homework.Model;

import java.util.Date;

/**
 * Created by Erwin on 03.10.2016.
 */

public class Test extends Entry {
    private int weight;

    public Test (String title, String description, Date duedate, School school, int weight) {
        super(title, description, duedate, school);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
