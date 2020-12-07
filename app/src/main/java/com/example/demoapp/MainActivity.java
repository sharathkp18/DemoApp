package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password; //ha-i
Button loginButton,signUpButton; //hai ,hello
DBConnection dbCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        loginButton=findViewById(R.id.loginButton);
        signUpButton=findViewById(R.id.signUpButton);
        dbCon=new DBConnection();
        loginButtonClick();
        signUpButtonClick();
    }
    public void loginButtonClick(){
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(username.getText().toString().isEmpty()||password.getText().toString().isEmpty()){
                  Toast.makeText(MainActivity.this, "please fill username/password", Toast.LENGTH_LONG).show();
                }else if (dbCon.checkUser("logintable",username.getText().toString(),password.getText().toString())) { //database
                   Toast.makeText(MainActivity.this, "valid user", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,Welcome.class));
                } else {
                    Toast.makeText(MainActivity.this, "in-valid user", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void signUpButtonClick(){
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
                //Toast.makeText(MainActivity.this, "function not implemented", Toast.LENGTH_LONG).show();
            }
        });
    }
}