package com.example.bmi_android_native;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        EditText edtweight, edtheightIn, edtheightFt;

        TextView txtresult;
        Button btncalculate;
        LinearLayout LLmain;

        edtweight = findViewById(R.id.edtWeight);
        edtheightIn = findViewById(R.id.edtHeightIn);
        edtheightFt = findViewById(R.id.edtHeightFt);
        txtresult = findViewById(R.id.txtresult);
        btncalculate = findViewById(R.id.btnCalculate);
        LLmain = findViewById(R.id.main);

        btncalculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(edtweight.getText().toString());
                int ft = Integer.parseInt(edtheightFt.getText().toString());
                int in = Integer.parseInt(edtheightIn.getText().toString());

                int totalIn = ft * 12 + in;
                double totalCm = totalIn * 2.53;
                double totalM = totalCm / 100;
                double BMI = wt / (totalM * totalM);
                String stringBMI = String.valueOf(BMI);
                if (BMI > 25) {
                    txtresult.setText("You are overweight " + stringBMI.substring(0, 2));
                    LLmain.setBackgroundColor(getResources().getColor(R.color.color_overwieght));
                } else if (BMI < 18) {
                    txtresult.setText("You are underweight" + stringBMI.substring(0, 2));
                    LLmain.setBackgroundColor(getResources().getColor(R.color.color_underw));
                } else {
                    txtresult.setText(" You are healthy" + stringBMI.substring(0, 2));


                    LLmain.setBackgroundColor(getResources().getColor(R.color.color_good));


                }
            }
        });
    }
}