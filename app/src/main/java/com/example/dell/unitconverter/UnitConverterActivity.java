package com.example.dell.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.Object;

public class UnitConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        TextView txtView = (TextView) findViewById(R.id.editText3);
        TextView tv=(TextView) findViewById(R.id.editText2);
        tv.setText(message);
        double num=Double.parseDouble(message);
        double num1;
        num1=  num* 100;
        String mess=String.valueOf(num1);
        txtView.setText(mess);



    }


}
