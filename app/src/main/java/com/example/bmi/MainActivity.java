package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtheigthin , edtheightft , edtweight;
        TextView result;
        Button bmibtn;
        LinearLayout mainLayout;
        edtheightft = findViewById(R.id.edtHeight_ft);
        edtweight = findViewById(R.id.edtWeight);
        edtheigthin = findViewById(R.id.edtHeight_in);
        result=findViewById(R.id.result);
        bmibtn=findViewById(R.id.bmibtn);
        mainLayout=findViewById(R.id.llmain);


        bmibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt=Integer.parseInt(edtweight.getText().toString());
                int hft=Integer.parseInt(edtheightft.getText().toString());
                int hin=Integer.parseInt(edtheigthin.getText().toString());

                int totalInch=(hft*12)+hin;
                double totalCm = totalInch*2.53;
                double totalM = totalCm/100;
                double bmi = wt/(totalM*totalM);

                if(bmi>25){
                   result.setText("You are overweight !");
                   mainLayout.setBackgroundColor(getResources().getColor(R.color.overw));
                }
                else if(bmi<18){
                    result.setText("You are underWeight !");
                    mainLayout.setBackgroundColor(getResources().getColor(R.color.underw));
                }
                else{
                    result.setText("You are healthy !");
                    mainLayout.setBackgroundColor(getResources().getColor(R.color.healthy));
                }
            }
        });
    }
}