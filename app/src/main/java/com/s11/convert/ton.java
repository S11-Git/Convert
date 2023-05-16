package com.s11.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ton);
        EditText ton = (EditText) findViewById(R.id.input);
        Button convert = (Button)findViewById(R.id.convertbtn);
        TextView result = (TextView)findViewById(R.id.result);

//      ton to gram, kilo, pound and ounce in java using try and catch
        try {
            convert.setOnClickListener(v -> {
                double ton1 = Double.parseDouble(ton.getText().toString());
                double gram1 = ton1 * 1e+6;
                double kilo1 = ton1 * 1000;
                double pound1 = ton1 * 2205;
                double ounce1 = ton1 * 35270;

                result.setText("Gram: " + gram1 + "\n" + "Kilo: " + kilo1 + "\n" + "Pound: " + pound1 + "\n" + "Ounce: " + ounce1);
            });
        }catch (Exception e){
//          print exception to gram
            result.setText(e.toString());
        }
    }
}