package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        //Getting instances of CheckBoxes
        final CheckBox chapoBeans = findViewById(R.id.checkBox);
        final CheckBox githeriNyama = findViewById(R.id.checkBox2);
        final CheckBox ugaliMatumbo = findViewById(R.id.checkBox3);
        Button orderButton = findViewById(R.id.button);

        //applying listener on orderButton
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalamount = 0;
                StringBuilder result = new StringBuilder();

                result.append("Selected Items: ");

                if(chapoBeans.isChecked()) {
                    result.append("Chapo Beans 80/=");
                    totalamount += 80;
                }

                if(githeriNyama.isChecked()) {
                    result.append("Githeri Nyama: 120/=");
                    totalamount += 120;
                }

                if(ugaliMatumbo.isChecked()) {
                    result.append("Ugali Matumbo: 150/=");
                    totalamount += 150;
                }

                result.append("\n Total: " + totalamount + "/=");

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
