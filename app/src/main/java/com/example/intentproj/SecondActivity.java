package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {



    Button add, substract, multiply, divide;

    TextView answer;
    EditText ET1,ET2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ET1 =  findViewById(R.id.inputbox);
        ET2 =  findViewById(R.id.inputbox2);

        add =  findViewById(R.id.add);
        substract =  findViewById(R.id.substract);
        divide =  findViewById(R.id.divide);
        multiply =  findViewById(R.id.multiply);

        answer =  findViewById(R.id.Ans);


                int NO1 = getIntent().getIntExtra("number1", 0);
                int NO2 = getIntent().getIntExtra("number2", 0);


        ET1.setText(String.valueOf(NO1));
        ET2.setText(String.valueOf(NO2));


        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Ans;
                int num1 = Integer.parseInt(ET1.getText().toString());
                int num2 = Integer.parseInt(ET2.getText().toString());
                Ans = num1 - num2;

                answer.setText(String.valueOf(num1)+" - "+String.valueOf(num2)+" = "+String.valueOf(Ans));

            }
        });




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Ans;
                int num1 = Integer.parseInt(ET1.getText().toString());
                int num2 = Integer.parseInt(ET2.getText().toString());
                Ans = num1 + num2;

                answer.setText(String.valueOf(num1)+" + "+String.valueOf(num2)+" = "+String.valueOf(Ans));

            }
        });





        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float Ans;
                int num1 = Integer.parseInt(ET1.getText().toString());
                int num2 = Integer.parseInt(ET2.getText().toString());
                Ans = (float) num1 / num2;

                answer.setText(String.valueOf(num1)+" / "+String.valueOf(num2)+" = "+String.valueOf(Ans));

            }
        });




        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Ans;
                int num1 = Integer.parseInt(ET1.getText().toString());
                int num2 = Integer.parseInt(ET2.getText().toString());
                Ans = num1 * num2;

                answer.setText(String.valueOf(num1)+" * "+String.valueOf(num2)+" = "+String.valueOf(Ans));

            }
        });


    }

}