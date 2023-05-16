package com.s11.convert;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button kilo;
    Button ton;
    Button gram;
    Button pound;
    Button ounce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kilo = (Button)findViewById(R.id.kilo);
        ton = (Button)findViewById(R.id.ton);
        gram = (Button)findViewById(R.id.gram);
        pound = (Button)findViewById(R.id.pound);
        ounce = (Button)findViewById(R.id.ounce);

        kilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, kilo.class));
            }
        });

        ton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ton.class));
            }
        });

        gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, gram.class));
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, pound.class));
            }
        });

        ounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ounce.class));
            }
        });

    }
}
