package com.example.group3.soundsleep;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SettingsActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_settings);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
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