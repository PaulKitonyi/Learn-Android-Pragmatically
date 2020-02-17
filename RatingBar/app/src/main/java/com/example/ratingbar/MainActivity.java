package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRating();
    }

    public void getRating() {
        final RatingBar ratingbar = findViewById(R.id.ratingBar);
        Button button = findViewById(R.id.button);

        //perform action on Button click

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the rating and display it on Toast
                String rating = String.valueOf(ratingbar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}
