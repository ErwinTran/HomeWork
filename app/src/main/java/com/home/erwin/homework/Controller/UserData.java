package com.home.erwin.homework.Controller;

import com.home.erwin.homework.Model.Entry;
import com.home.erwin.homework.Model.School;

import java.util.ArrayList;
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
