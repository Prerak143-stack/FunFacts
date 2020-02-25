package com.example.patel.funfacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button factButton;
    private RelativeLayout mainLayout;
    private FunFacts funFacts;
    private BgColor bgColor;
    private int color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        factTextView = findViewById(R.id.factTextView);
        factButton = findViewById(R.id.factButton);
        mainLayout = findViewById(R.id.mainLayout);
        funFacts = new FunFacts();
        bgColor = new BgColor();

        color = bgColor.getBgColor();

        factTextView.setText(funFacts.getFunFact());
        mainLayout.setBackgroundColor(color);
        factButton.setTextColor(color);


        factButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                color = bgColor.getBgColor();
                factTextView.setText(funFacts.getFunFact());
                mainLayout.setBackgroundColor(color);
                factButton.setTextColor(color);

            }

        });

    }

}
