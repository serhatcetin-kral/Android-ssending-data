package com.example.sendingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText Password;
    Button Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.username);
        Password=findViewById(R.id.password);

        Btn=findViewById(R.id.btn);

// when click button
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username1=userName.getText().toString();
                String password1=Password.getText().toString();

            //if is empty warning user name or password
                if(TextUtils.isEmpty(username1) || TextUtils.isEmpty(password1)){
                    Toast.makeText(MainActivity.this, "please fill all empty place", Toast.LENGTH_LONG).show();
                }
                else if(username1.equals("murat") && password1.equals("kaan")){

                    Intent gecis= new Intent(MainActivity.this,sendingData_anotherpage.class);
                    gecis.putExtra("usernameGonderilen",username1);
                    startActivity(gecis);
                    finish(); // bu kisim uygulamadan cikarir finish kodu
                }
           else{
               Toast.makeText(MainActivity.this,"user name or password is wrong",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}