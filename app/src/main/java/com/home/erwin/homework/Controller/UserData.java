package com.home.erwin.homework.Controller;

import com.home.erwin.homework.Model.Entry;
import com.home.erwin.homework.Model.Homework;
import com.home.erwin.homework.Model.School;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Erwin on 03.10.2016.
 */

public class UserData {
    private List<Entry> entryList;
    private List<School> schoolList;

    public static UserData instance;

    private UserData() {
    }

    public static UserData getInstance() {
        if(instance != null) {
            return instance;
        }
        return new UserData();
    }

    public List<Entry> getEntryList() {
        // TODO: get dbconnection
        List<Entry> list  = new ArrayList<>();
        list.add(new Homework("Mathi HA", "S.123", new Date(), new School("BMS", School.WeekDay.MONDAY), Homework.Priority.NORMAL));
        list.add(new Homework("Englisch HA", "Blatt 1", new Date(), new School("BMS", School.WeekDay.MONDAY), Homework.Priority.NORMAL));
        list.add(new Homework("Geschichte HA", "S.12 lesen", new Date(), new School("BMS", School.WeekDay.MONDAY), Homework.Priority.NORMAL));
        list.add(new Homework("Mathi HA", "Dossier S5", new Date(), new School("BMS", School.WeekDay.MONDAY), Homework.Priority.NORMAL));
        return list;
    }

    public List<School> getSchoolList() {
        // TODO: get dbconnection
        List<School> list  = new ArrayList<>();
        return list;
    }

    public void saveHomeworkEntry() {
        // TODO: add function
    }

    public void saveTestEntry() {
        // TODO: add function
    }

    public void saveSchool() {
        // TODO: add function
    }
}
