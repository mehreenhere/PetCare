package com.example.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void backToLogin(View V){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    EditText ruser;
    EditText rpass;
    EditText email;
    EditText cpass;

    public void register(View V){
        ruser = findViewById(R.id.editText3);
        rpass = findViewById(R.id.editText4);
        email = findViewById(R.id.editText5);
        cpass = findViewById(R.id.editText6);

        if(ruser.getText().toString().equals("") ||
                rpass.getText().toString().equals("") ||
                    email.getText().toString().equals("") ||
                        cpass.getText().toString().equals("")){
            Toast.makeText(this, "A Field is Empty", Toast.LENGTH_SHORT).show();
        } else {
            Intent i=new Intent(this,dashBoard.class);
            startActivity(i);
        }
    }

}
