package com.teemurishe.usefulapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void dieMAZAFAKA(View view) {
            Toast toast3 = Toast.makeText(getApplicationContext(),
            "YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEES", Toast.LENGTH_LONG); //na etom dolbanom texte pochemu to vse derzhitsa
            toast3.setGravity(Gravity.CENTER, 0, 0);
            LinearLayout toastContainer = (LinearLayout) toast3.getView();
            ImageView shitImageView = new ImageView(getApplicationContext());
            shitImageView.setImageResource(R.drawable.dodik);
            toastContainer.addView(shitImageView, 0);
            toast3.show();
        }

        public void goodPes(View view) {
            Toast toast3 = Toast.makeText(getApplicationContext(),
                    "YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEES", Toast.LENGTH_LONG);
            toast3.setGravity(Gravity.CENTER, 0, 0);
            LinearLayout toastContainer = (LinearLayout) toast3.getView();
            ImageView goodImageView = new ImageView(getApplicationContext());
            goodImageView.setImageResource(R.drawable.xi);
            toastContainer.addView(goodImageView, 0);
            toast3.show();
        }

    }