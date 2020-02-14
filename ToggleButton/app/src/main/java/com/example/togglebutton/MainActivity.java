package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenOnButtonClick();
    }


    public void addListenOnButtonClick() {
        final ToggleButton toggleButton1 =  findViewById(R.id.toggleButton);
        final ToggleButton toggleButton2 =  findViewById(R.id.toggleButton2);
        Button submitButton =  findViewById(R.id.button);

        //Perform action on button click
        submitButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                StringBuilder result = new StringBuilder();

                result.append("Toggle Button 1: ").append(toggleButton1.getText());
                result.append("Toggle Button 2: ").append(toggleButton2.getText());

                //Displaying the message in toast
                Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
