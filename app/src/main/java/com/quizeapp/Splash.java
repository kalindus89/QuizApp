package com.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logo logo = new logo();
        logo.start();

    }

    private class logo extends Thread
    {
        public void run()
        {
            try {

                    sleep(2000);


            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            Intent intent = new Intent(Splash.this,MenuActivity.class);
            startActivity(intent);
            Splash.this.finish();
        }
    }



}