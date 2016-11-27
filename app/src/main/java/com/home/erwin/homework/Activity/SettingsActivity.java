package com.home.erwin.homework.Activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.home.erwin.homework.Controller.UserData;
import com.home.erwin.homework.R;

public class SettingsActivity extends AppCompatActivity {

    private ListView schoolListLv;
    private Button newSchoolBt;
    private Button deleteAllEntryBt;
    private Button doneBt;
    private UserData userData;

    private static final int CREATE_NEW_SCHOOL_REQUEST_CODE = 222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        userData = UserData.getInstance();

        initializeComponents();
        initialiteListeners();
    }

    private void initializeComponents() {
        newSchoolBt = (Button) findViewById(R.id.newSchool);
        deleteAllEntryBt = (Button) findViewById(R.id.deleteAllEntry);
        doneBt = (Button) findViewById(R.id.done);

        schoolListLv = (ListView) findViewById(R.id.schoolList);
        schoolListLv.setAdapter(new SchoolArrayAdapter(this, userData.getSchoolList()));
    }

    private void initialiteListeners() {
        newSchoolBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), EditSchoolActivity.class);
                startActivityForResult(intent, CREATE_NEW_SCHOOL_REQUEST_CODE);
            }
        });

        deleteAllEntryBt.setOnClickListener(new View.OnClickListener() {
            public void  onClick(View v) {
                showDialog();
            }
        });

        doneBt.setOnClickListener(new View.OnClickListener() {
            public void  onClick(View v) {
                Intent returnIntent = new Intent();
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }

    private void showDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Delete ALL entry")
                .setMessage("Are you sure you want to delete all entries?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        userData.deleteAllEntries();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                        dialog.cancel();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
