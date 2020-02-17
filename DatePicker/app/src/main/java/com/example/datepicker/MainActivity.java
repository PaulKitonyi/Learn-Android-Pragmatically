package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        myDatePicker();
    }

    public void myDatePicker() {
        final TextView textview1 = findViewById(R.id.textView1);

        Button displayDate = findViewById(R.id.button1);

        textview1.setText("Current Date: " + getCurrentDate());

        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("Change Date: " + getCurrentDate());
            }
        });
    }

    public String getCurrentDate() {
        DatePicker picker = findViewById(R.id.datePicker);
        StringBuilder builder = new StringBuilder();
        builder.append((picker.getMonth() + 1) + "/");//Month is 0 based
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        return builder.toString();
    }
}
