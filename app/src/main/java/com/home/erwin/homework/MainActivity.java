package com.home.erwin.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button newEntryBt;
    final static int CREATE_NEW_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
        initializeListeners();
    }

    private void initializeComponents() {
        newEntryBt = (Button) findViewById(R.id.newEntryBt);
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
