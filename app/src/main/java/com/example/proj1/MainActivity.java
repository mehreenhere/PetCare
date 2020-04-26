package com.example.proj1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences myPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPref = getSharedPreferences("user_details", MODE_PRIVATE);
        if (myPref.getString("username",null) != null){
            Intent i = new Intent(this,dashBoard.class);
            startActivity(i);
        }
    }


    public void func1(View v) {
        Intent i = new Intent(this, Registration.class);
        startActivity(i);
    }

    EditText username;
    EditText pass;

    public void login(View V) {
        username = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        if (username.getText().toString().equals("") ||
                pass.getText().toString().equals("")) {
            Toast.makeText(this, "Username or Password is Empty", Toast.LENGTH_SHORT).show();
        } else {

            SharedPreferences.Editor editor = myPref.edit();
            editor.putString("username",username.getText().toString());
            editor.apply();

            Intent i = new Intent(this, dashBoard.class);
            startActivity(i);
        }
    }


}



