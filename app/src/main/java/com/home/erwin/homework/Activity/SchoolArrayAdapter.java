package com.home.erwin.homework.Activity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.home.erwin.homework.Model.School;
import com.home.erwin.homework.R;

import java.util.List;

/**
 * Created by Erwin on 08.10.2016.
 */

public class SchoolArrayAdapter extends ArrayAdapter<School> {

    public SchoolArrayAdapter(Context context, List<School> schools) {
        super(context, 0, schools);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get entry at position
        School school = getItem(position);

        if(convertView == null) {
            // set row layout
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.school_row, parent, false);
        }

        TextView colorSquareTv = (TextView) convertView.findViewById(R.id.colorSquare);
        TextView schoolNameTv = (TextView) convertView.findViewById(R.id.schoolName);
        TextView schoolDayTv = (TextView) convertView.findViewById(R.id.weekday);

        int colorValue = Color.parseColor(school.getColor());
        colorSquareTv.setBackgroundColor(colorValue);
        schoolNameTv.setText(school.getName());
        schoolDayTv.setText(school.getDay());

        return convertView;
    }
}
