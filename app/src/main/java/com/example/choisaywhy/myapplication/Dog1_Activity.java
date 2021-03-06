package com.example.choisaywhy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dog1_Activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog1_main);

        ImageButton btn1 = (ImageButton)findViewById(R.id.btn1);
        ImageButton btn2 = (ImageButton)findViewById(R.id.btn2);
        ImageButton btn3 = (ImageButton)findViewById(R.id.btn3);
        ImageButton btn4 = (ImageButton)findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dog1_Activity.this, Dog1_Activity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dog1_Activity.this, Dog2_Activity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dog1_Activity.this, Dog3_Activity.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dog1_Activity.this, Dog4_Activity.class);
                startActivity(intent);
            }
        });

    }
}
