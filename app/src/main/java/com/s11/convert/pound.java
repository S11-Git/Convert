package com.s11.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pound);
        EditText pound = (EditText) findViewById(R.id.input);
        Button convert = (Button)findViewById(R.id.convertbtn);
        TextView result = (TextView)findViewById(R.id.result);

//      pound to gram, ton, kilo and ounce in java using try and catch
        try {
            convert.setOnClickListener(v -> {
                double pound1 = Double.parseDouble(pound.getText().toString());
                double gram1 = pound1 * 453.592;
                double ton1 = pound1 / 2205;
                double kilo1 = pound1 * 0.453592;
                double ounce1 = pound1 * 16;

                result.setText("Gram: " + gram1 + "\n" + "Ton: " + ton1 + "\n" + "Kilo: " + kilo1 + "\n" + "Ounce: " + ounce1);
            });
        }catch (Exception e){
//          print exception to gram
            result.setText(e.toString());
        }

    }
}