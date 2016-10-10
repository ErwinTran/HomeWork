package com.home.erwin.homework.Activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.home.erwin.homework.Model.Weekday;
import com.home.erwin.homework.R;

import java.util.ArrayList;
import java.util.List;

public class EditSchoolActivity extends AppCompatActivity {

    private EditText schoolNameEt;
    private Spinner schoolDaySp;
    private Button colorPickerBt;
    private Button cancelBt;
    private Button saveBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_school_activity);

        initializeComponents();
        initializeListeners();
    }

    private void initializeComponents() {
        schoolNameEt = (EditText) findViewById(R.id.schoolNameEt);
        schoolDaySp = (Spinner) findViewById(R.id.schoolDaySp);
        initializeSpinner();
        colorPickerBt = (Button) findViewById(R.id.colorPickerBt);
        cancelBt = (Button) findViewById(R.id.cancelBt);
        saveBt = (Button) findViewById(R.id.saveBt);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void initializeListeners() {

        cancelBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                setResult(Activity.RESULT_CANCELED, returnIntent);
                finish();
            }
        });

        saveBt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                // add data in intent
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }

    private void initializeSpinner() {
        List<String> weekdayList = new ArrayList<>();
        weekdayList.add(Weekday.MONDAY.getString());
        weekdayList.add(Weekday.TUESDAY.getString());
        weekdayList.add(Weekday.WEDNESDAY.getString());
        weekdayList.add(Weekday.THURSDAY.getString());
        weekdayList.add(Weekday.FRIDAY.getString());
        weekdayList.add(Weekday.SATURDAY.getString());
        weekdayList.add(Weekday.SUNDAY.getString());

        ArrayAdapter<String> weekdayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, weekdayList);
        weekdayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        schoolDaySp.setAdapter(weekdayAdapter);
    }
}
