package com.example.bmi_android_native;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        EditText edtweight,edtheightIn,edtheightFt;

        TextView txtresult;
        Button btncalculate;

        edtweight=findViewById(R.id.edtWeight);
        edtheightIn=findViewById(R.id.edtHeightIn);
        edtheightFt=findViewById(R.id.edtHeightFt);
        txtresult=findViewById(R.id.txtresult);
        btncalculate=findViewById(R.id.btnCalculate);


    }
}