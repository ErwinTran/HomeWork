package com.home.erwin.homework.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.home.erwin.homework.Model.Entry;
import com.home.erwin.homework.R;

import java.util.List;

/**
 * Created by Erwin on 07.10.2016.
 */

public class EntryArrayAdapter extends ArrayAdapter<Entry> {

    public EntryArrayAdapter(Context context, List<Entry> entries) {
        super(context, 0, entries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get entry at position
        Entry entry = getItem(position);

        if(convertView == null) {
            // set row layout
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.entry_row, parent, false);
        }

        TextView entryTitleTv = (TextView) convertView.findViewById(R.id.entryTitle);
        TextView entryDateTv = (TextView) convertView.findViewById(R.id.entryDate);
        TextView entrySchoolTv = (TextView) convertView.findViewById(R.id.entrySchool);

        entryTitleTv.setText(entry.getTitle());
        String date = android.text.format.DateFormat.format("dd.MM.yyyy", entry.getDuedate()).toString();
        entryDateTv.setText(date);
        entrySchoolTv.setText(entry.getSchool().getName());

        return convertView;
    }
}
