package com.s11.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ounce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ounce);

        EditText ounce = (EditText) findViewById(R.id.input);
        Button convert = (Button)findViewById(R.id.convertbtn);
        TextView result = (TextView)findViewById(R.id.result);
        //      convert ounce to gram, ton, pound and kilo in java using try and catch
        try {
            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double ounce1 = Double.parseDouble(ounce.getText().toString());
                    double gram1 = ounce1 * 28.35;
                    double ton1 = ounce1 / 35274;
                    double pound1 = ounce1 / 16;
                    double kilo1 = ounce1 / 35.274;

                    result.setText("Gram: " + gram1 + "\n" + "Ton: " + ton1 + "\n" + "Pound: " + pound1 + "\n" + "Kilo: " + kilo1);
                }
            });
        }catch (Exception e){
//          print exception to gram
            result.setText(e.toString());
        }
    }
}