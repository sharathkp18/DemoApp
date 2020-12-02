package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password; //ha-i
Button loginButton,signUpButton; //hai ,hello
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        loginButton=findViewById(R.id.loginButton);
        signUpButton=findViewById(R.id.signUpButton);
        loginButtonClick();
        signUpButtonClick();//display123
    }
    public void loginButtonClick(){
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = username.getText().toString();
                String passInput = password.getText().toString();

                if(userInput.isEmpty()||passInput.isEmpty()){
                    Toast.makeText(MainActivity.this, "please fill username/password", Toast.LENGTH_LONG).show();
                }else if (userInput.equals("xyz") && passInput.equals("123")) { //database
                   // Toast.makeText(MainActivity.this, "valid user", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
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
                Toast.makeText(MainActivity.this, "function not implemented", Toast.LENGTH_LONG).show();
            }
        });
    }
}