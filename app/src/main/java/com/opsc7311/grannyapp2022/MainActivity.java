package com.opsc7311.grannyapp2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtName, txtPassword;
    private TextView lblErrorBox;
    private Button btnLogin;
    private LoginSystem lg = new LoginSystem();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText) findViewById(R.id.txtUserNameHP);
        txtPassword = (EditText) findViewById(R.id.txtPasswordHP);
        lblErrorBox = (TextView) findViewById(R.id.lblErrorHP);
        btnLogin = findViewById(R.id.btnSignIn);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(v);
            }
        });

    }

    public void Login(View view)
    {
        boolean blogin = lg.Login(txtName.getText().toString(), txtPassword.getText().toString());
        if (blogin)
        {

            Intent intent = new Intent(getApplicationContext(),WelcomeUser.class);
            startActivity(intent);
        }
        else
        {
            String error = "Error: Please sign in with the correct  " +
                    "\ndetails and try again \n\n Good luck";
            lblErrorBox.setText(error);
            Toast.makeText(getApplicationContext(),error,Toast.LENGTH_SHORT).show();
        }
    }
}