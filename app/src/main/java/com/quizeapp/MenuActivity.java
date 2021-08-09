package com.quizeapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity {


MaterialCardView cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8,cat9,cat10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        cat1=findViewById(R.id.cat1);
        cat2=findViewById(R.id.cat2);
        cat3=findViewById(R.id.cat3);
        cat4=findViewById(R.id.cat4);
        cat5=findViewById(R.id.cat5);
        cat6=findViewById(R.id.cat6);
        cat7=findViewById(R.id.cat7);
        cat8=findViewById(R.id.cat8);
        cat9=findViewById(R.id.cat9);
        cat10=findViewById(R.id.cat10);

// change textview ID's


        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        cat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });


    }


}