package com.azhar.laundry.view.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.azhar.laundry.R;
import com.azhar.laundry.view.main.MainActivity;

public class LoginActivity extends AppCompatActivity {

    Button toLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setInitLayout();

    }

    private void setInitLayout(){
        toLogin = findViewById(R.id.btn_login);
        Button btnLogin = (Button)findViewById(R.id.btn_login);
        if(toLogin != null) {
            toLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }
            });
        } else {
            System.out.print("btn to Login : "+toLogin);
        }


    }
}