package com.interns.flexisaf_androidcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button Add, Sub, multiplication, divide;
    TextView display;
    int Sum, number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Add = findViewById(R.id.Addition);
        display = findViewById(R.id.display);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                Sum = number1 + number2;
                display.setText(String.valueOf(Sum));
            }
        });

    }

}