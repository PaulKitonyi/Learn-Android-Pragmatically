package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView();
    }

    public void autoCompleteTextView() {
        String[] languages = {"Java", "JAVASCRIPT","PYTHON","SOLIDITY","GO", "C", "C++", "RUBY","RUST"};

        //Creating the instance of ArrayAdapter containing list of languages names
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, languages);

        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView mytextView = findViewById(R.id.autoCompleteTextView);
        mytextView.setThreshold(1);//will start working from the first character
        mytextView.setAdapter(adapter);//setting the adapter data into the autocompletetextview
        mytextView.setTextColor(Color.RED);
    }
}
