package com.jennhsu.gastracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.util.Log;

public class AddActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Button buttonAdd = (Button)findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText odometerReadingField = (EditText) findViewById(R.id.odometerReadingField);
                EditText gasAddedField = (EditText) findViewById(R.id.gasAddedField);
                EditText gasPriceField = (EditText) findViewById(R.id.gasPriceField);
                double odometerReading = Double.valueOf(odometerReadingField.getText().toString());
                double gasAdded = Double.valueOf(gasAddedField.getText().toString());
                double gasPrice = Double.valueOf(gasPriceField.getText().toString());

                DataTracker a = new DataTracker(odometerReading,gasAdded,gasPrice);
                DataTracker.a_list.add(a);
                Log.d("data", DataTracker.a_list.toString());

                Intent intent = new Intent(v.getContext(), ViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
