package com.example.dell.unitconverter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.R.attr.value;
import static android.R.id.message;


class MainActivity extends Activity {

    private Spinner spinner1, spinner2;
    private Button btnSubmit;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addListenerOnButton();
        addListenerOnSpinnerItemSelection();

    }
    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner);

    }

    // get the selected dropdown list value
    public void addListenerOnButton() {
        final EditText mEdit = (EditText) findViewById(R.id.editText2);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        btnSubmit = (Button) findViewById(R.id.button);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                switch (String.valueOf(spinner1.getSelectedItem())) {
                    case "Metres":
                        Intent unitIntent = new Intent(getApplicationContext(), UnitConverterActivity.class);
                        unitIntent.putExtra("message",mEdit.getText().toString());
                        startActivity(unitIntent);
                        break;

                    case "Kilograms":
                        Intent unitIntent1 = new Intent(getApplication(), LengthConverterActivity.class);
                        unitIntent1.putExtra("message",mEdit.getText().toString());
                        startActivity(unitIntent1);
                        break;

                    case "Inches":
                        Intent unitIntent2 = new Intent(getApplicationContext(), MetricConverterActivity.class);
                        unitIntent2.putExtra("message",mEdit.getText().toString());
                        startActivity(unitIntent2);
                        break;
                }
            }

        });
    }}


