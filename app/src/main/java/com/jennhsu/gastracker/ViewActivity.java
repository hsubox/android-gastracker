package com.jennhsu.gastracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        GridView gridview = (GridView) findViewById(R.id.displayData);
        gridview.setAdapter(new DataTrackerAdapter(this));
    }
}
