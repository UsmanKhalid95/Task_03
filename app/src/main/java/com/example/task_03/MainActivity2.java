package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    String [] ArabicLetters={"ا","ب","ت","ث","ج","ح","خ","د","ذ","ر","ز","س","ش","ص","ض","ط","ظ","ع","غ","ف","ق","ك","ل","م","ن","ه","و","ي"};
    Random rNum=new Random();
    TextView text;
    Button throat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int index= rNum.nextInt(28);
        text=findViewById(R.id.textView2);
        text.setText(ArabicLetters[index]);

        throat=findViewById(R.id.button4);
        throat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent;
                if(ArabicLetters[index].equals("ا") || ArabicLetters[index].equals("ه") || ArabicLetters[index].equals("ع") || ArabicLetters[index].equals("ح" )|| ArabicLetters[index].equals("غ") || ArabicLetters[index].equals("خ") )
                {
                    intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("keyname",ArabicLetters[index]);
                    startActivity(intent);
                }
                else{
                    intent = new Intent(MainActivity2.this, MainActivity2.class);
                    startActivity(intent);
                }

            }
        });


    }

   
}