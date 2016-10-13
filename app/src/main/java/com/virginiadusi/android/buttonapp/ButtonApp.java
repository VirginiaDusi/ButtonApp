package com.virginiadusi.android.buttonapp;

import android.graphics.Color;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ButtonApp extends AppCompatActivity {
    TextView t1;
    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_app);

        b1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById (R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("Ouch, you clicked me!");
                t1.setBackgroundColor(Color.MAGENTA);

            }
        });






    }
}
