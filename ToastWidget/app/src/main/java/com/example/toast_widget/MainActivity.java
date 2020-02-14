package com.example.toast_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showtost();
    }


    public void showtost(){
        //Toast to show Hello World
        Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
    }

}
