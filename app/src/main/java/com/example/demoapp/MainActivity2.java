package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText firstName,last_name,phone_number,email_id,create_password,conform_password;
    Button submit_area,cancel_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        firstName = findViewById(R.id.firstName);
        last_name = findViewById(R.id.last_name);
        phone_number = findViewById(R.id.phone_number);
        email_id = findViewById(R.id.email_id);
        create_password = findViewById(R.id.create_password);
        conform_password = findViewById(R.id.confirm_password);
        submit_area = findViewById(R.id.submit_area);
        cancel_button = findViewById(R.id.cancel_button);
        SubmitButton();

    }
    public void SubmitButton() {
            submit_area.setOnClickListener(new view.OnClickListener() {
                public void onClick(View v) {
                    String firstInput = firstName.getText().toString();
                    String lastInput = last_name.getText().toString();
                    String phoneInput = phone_number.getText().toString();
                    String EmailInput = email_id.getText().toString();
                    String passInput = create_password.getText().toString();
                    String conformInput = conform_password.getText().toString();
                    if(firstInput.isEmpty()&& lastInput.isEmpty() && phoneInput.isEmpty() && EmailInput.isEmpty() && passInput.isEmpty()&& conformInput.isEmpty())
                    {

                    Toast.makeText(MainActivity2.this, "submitted Successfully", Toast.LENGTH_LONG).show();
                }
                    else{
                        Toast.makeText(MainActivity2.this, "fill the empty field", Toast.LENGTH_LONG).show();
                    }
            }
    });
}
}