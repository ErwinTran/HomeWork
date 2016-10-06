package com.home.erwin.homework.Activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.home.erwin.homework.R;

public class EditEntryActivity extends AppCompatActivity {

    private Button cancelBt;
    private Button saveBt;
    private EditText titleTv;
    private EditText descriptionTv;
    private EditText dateTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_entry_activity);

        init_activity();
        init_listener();
    }

    private void init_activity() {
        cancelBt = (Button) findViewById(R.id.cancelBt);
        saveBt = (Button) findViewById(R.id.saveBt);

        titleTv = (EditText) findViewById(R.id.titleTv);
        descriptionTv = (EditText) findViewById(R.id.descriptionTv);
        dateTv = (EditText) findViewById(R.id.dateTv);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void init_listener() {
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
