package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Password_Page extends AppCompatActivity {
    Button btnnetx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_page);

        btnnetx=findViewById(R.id.passwordnext);

        btnnetx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Password_Page.this,MainActivity6.class);
                startActivity(intent);

            }
        });
    }
}