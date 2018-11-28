package com.example.group3.soundsleep;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.RED;

public class SettingsActivity extends Activity  {
    private Activity act;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        act = this;
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_settings);
        button1 = findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                button1.setTextColor(RED);
//                Utils.changeToTheme(act, Utils.THEME_DEFAULT);
//            }
//        });
//        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Utils.changeToTheme(act, Utils.THEME_DARK);
//            }
//        });
//        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Utils.changeToTheme(act, Utils.THEME_DEFAULT);
//            }
//        });
    }

//    @Override
    public void newOnClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Utils.changeToTheme(this, Utils.THEME_DEFAULT);
                break;
            case R.id.button2:
                Utils.changeToTheme(this, Utils.THEME_DARK);
                break;
            case R.id.button3:
                Utils.changeToTheme(this, Utils.THEME_BLUE);
                break;
        }
    }

}