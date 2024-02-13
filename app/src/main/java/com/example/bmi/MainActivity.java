package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtheigthin , edtheightft , edtweight;
        TextView result;
        Button bmibtn;
        edtheightft = findViewById(R.id.edtHeight_ft);
        edtweight = findViewById(R.id.edtWeight);
        edtheigthin = findViewById(R.id.edtHeight_in);
    }
}