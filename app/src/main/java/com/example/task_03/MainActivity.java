package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button repo;
    Button learn;
    Intent intent;
    Button quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repo=findViewById(R.id.button);
        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://github.com/UsmanKhalid95/Task_03.git");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        learn=findViewById(R.id.button2);
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1SYtSfO2ftkPzq3UDgmPb5QGaOxEUtayi/view?usp=sharing");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        quiz=findViewById(R.id.button3);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });







    }
}