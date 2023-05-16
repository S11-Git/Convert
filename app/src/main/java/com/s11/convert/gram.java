package com.s11.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram);

        EditText gram = (EditText) findViewById(R.id.input);
        Button convert = (Button)findViewById(R.id.convertbtn);
        TextView result = (TextView)findViewById(R.id.result);

//        convert gram to kilo, ton, pound and ounce in java using try and catch
        try {
            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double gram1 = Double.parseDouble(gram.getText().toString());
                    double kilo1 = gram1 / 1000;
                    double ton1 = gram1 / 1000000;
                    double pound1 = gram1 / 453.592;
                    double ounce1 = gram1 / 28.35;

                    result.setText("Kilo: " + kilo1 + "\n" + "Ton: " + ton1 + "\n" + "Pound: " + pound1 + "\n" + "Ounce: " + ounce1);
                }
            });
        }catch (Exception e){
//          print exception to gram
            result.setText(e.toString());
        }

    }
}