package com.opsc7311.grannyapp2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeUser extends AppCompatActivity {
    private LoginSystem lg = new LoginSystem();
    private TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_user);
        tvWelcome = findViewById(R.id.lblWelcomeHP);

        Toast.makeText(getApplicationContext(),"Logged in correctly! " + lg.GetLoginUser(),Toast.LENGTH_SHORT).show();
        tvWelcome.setText("Logged in correctly " + lg.GetLoginUser());
    }
}