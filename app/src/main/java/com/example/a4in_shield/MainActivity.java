package com.example.a4in_shield;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import stic.cdam.a4in_shield.R;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            TextView yourButton = (TextView) findViewById(R.id.sign);

            yourButton.setOnClickListener(new View.OnClickListener(){


                public void onClick(View v){
                    startActivity(new Intent(MainActivity.this, SignUp.class));
                }

            });

        }
}
