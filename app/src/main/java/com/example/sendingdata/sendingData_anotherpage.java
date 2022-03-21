package com.example.sendingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class sendingData_anotherpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_data_anotherpage);


        Intent al=getIntent();
        String ad=al.getStringExtra("usernameGonderilen");
        Toast.makeText(this,"mr "+ad+" welcome to main page ",Toast.LENGTH_LONG).show();
    }
}