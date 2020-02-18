package com.example.imageswitcher;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    Button nextButton;

    int imageSwitcherImages[] = {R.drawable.java, R.drawable.cpp, R.drawable.js, R.drawable.python,
            R.drawable.ruby,R.drawable.bitcoin,R.drawable.blockchain,R.drawable.ethereum,
            R.drawable.git,R.drawable.docker,R.drawable.laravel
    };

    int switcherImageLength = imageSwitcherImages.length;

    int counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ImageSwitcher imageSwitcher = findViewById(R.id.imageSwitcher);
        Button nextButton = findViewById(R.id.button);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView switcherImageView = new ImageView(getApplicationContext());
                switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));

                switcherImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                switcherImageView.setImageResource(R.drawable.java);
                return switcherImageView;
            }
        });

        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        imageSwitcher.setOutAnimation(aniOut);
        imageSwitcher.setOutAnimation(aniIn);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter ++;

                if(counter == switcherImageLength) {
                    counter = 0;
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }
                else {
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }
            }
        });
    }
}
