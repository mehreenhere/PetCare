package com.example.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class dashBoard extends AppCompatActivity {

    SharedPreferences pref;
    TextView usernameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        pref = getSharedPreferences("user_details", MODE_PRIVATE);

        String username = pref.getString("username",null);
        usernameText = findViewById(R.id.textView10);
        usernameText.setText("Welcome, "+username);
    }

    public void logout(View v) {
        pref.edit().clear().apply();

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
