package com.jennhsu.gastracker;

import android.util.Log;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import android.content.Context;
import java.util.ArrayList;

/**
 * Created by jennhsu on 10/13/16.
 */

public class DataTrackerAdapter extends BaseAdapter {
    private Context mContext;

    public DataTrackerAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return DataTracker.a_list.size()*3;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            textView = new TextView(mContext);
            textView.setLayoutParams(new GridView.LayoutParams(300,100));
            textView.setPadding(8,8,8,8);
        } else {
            textView = (TextView) convertView;
        }

        int row = (int) position/3;
        DataTracker b = (DataTracker) (DataTracker.a_list.get(row));
        int col = position % 3;
        double val = 0;
        switch (col) {
            case 0:
                val = b.odometerReading;
                break;
            case 1:
                val = b.gasAdded;
                break;
            case 2:
                val = b.gasPrice;
                break;
        }
        Log.d("dta", "pos: " + position + " data: " + Double.toString(val));
        textView.setText(Double.toString(val));
        return textView;
    }
}