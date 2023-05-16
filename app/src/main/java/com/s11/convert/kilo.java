package com.s11.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kilo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilo);

        EditText kilo = (EditText) findViewById(R.id.input);
        Button convert = (Button)findViewById(R.id.convertbtn);
        TextView result = (TextView)findViewById(R.id.result);

//      kilo to gram, ton, pound and ounce in java using try and catch
        try {
            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double kilo1 = Double.parseDouble(kilo.getText().toString());
                    double gram1 = kilo1 * 1000;
                    double ton1 = kilo1 / 1000;
                    double pound1 = kilo1 * 2.205;
                    double ounce1 = kilo1 * 35.274;

                    result.setText("Gram: " + gram1 + "\n" + "Ton: " + ton1 + "\n" + "Pound: " + pound1 + "\n" + "Ounce: " + ounce1);
                }
            });
        }catch (Exception e){
//          print exception to gram
            result.setText(e.toString());
        }



    }
}