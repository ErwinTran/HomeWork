package com.home.erwin.homework.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.home.erwin.homework.Controller.UserData;
import com.home.erwin.homework.Model.Entry;
import com.home.erwin.homework.R;

public class MainActivity extends AppCompatActivity {

    private Button newEntryBt;
    private ListView entryListLv;
    private UserData userData;

    final static int CREATE_NEW_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userData = UserData.getInstance();
        initializeComponents();
        initializeListeners();
    }

    private void initializeComponents() {
        newEntryBt = (Button) findViewById(R.id.newEntryBt);

        entryListLv = (ListView) findViewById(R.id.entryList);
        entryListLv.setAdapter(new EntryArrayAdapter(this, userData.getEntryList()));
    }

    private void initializeListeners() {
        newEntryBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), EditEntryActivity.class);
                startActivityForResult(intent, CREATE_NEW_ACTIVITY_REQUEST_CODE);
            }
        });
    }
}
