package com.example.group3.soundsleep;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends Activity {
    TextView password;
    TextView username;
    TextView incorrectLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        username = (TextView)findViewById(R.id.txtUsername);
        password = (TextView)findViewById(R.id.txtPassword);
        incorrectLogin = (TextView)findViewById(R.id.txtIncorrectLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("password") || attemptLogin(username, password)) {
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                }
                else{
                    incorrectLogin.setVisibility(View.VISIBLE);
                }
            }
        });

        Button btnCreateAccount = (Button)findViewById(R.id.btnCreateAccount);

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CreateAccountActivity.class));
            }
        });
    }
    private boolean attemptLogin(TextView username, TextView password){
        return false;
    }

}