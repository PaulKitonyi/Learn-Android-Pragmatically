package com.example.androidwidgets_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import cn.pedant.SweetAlert.SweetAlertDialog;
import android.graphics.Color;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        final EditText first_number =  findViewById(R.id.editText1);
        final EditText second_number =  findViewById(R.id.editText2);
        Button sum_button = findViewById(R.id.button);


        sum_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String value1 = first_number.getText().toString();
                String value2 = second_number.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a + b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
                       

        });

    }
}
