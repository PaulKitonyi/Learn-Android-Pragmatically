package com.example.viewstub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ViewStub viewStub;
    Button show,hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button show=findViewById(R.id.show);
        Button hide=findViewById(R.id.hide);
        final ViewStub viewStub=findViewById(R.id.viewStub);
        viewStub.inflate();

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.VISIBLE);
            }
        });
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.GONE);
            }
        });
    }
}
