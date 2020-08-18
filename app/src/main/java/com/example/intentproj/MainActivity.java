package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText ET1,ET2;

    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonListener();
    }

    public void OnclickButtonListener(){

        ET1 = findViewById(R.id.text1);
        ET2 = findViewById(R.id.text2);

        Btn = findViewById(R.id.ok);


        Btn.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {


                        Context context = getApplicationContext();
                        CharSequence msg = "You just clicked the OK button";
                        int duration = Toast.LENGTH_SHORT;

                        Toast T1 = Toast.makeText(context,msg,duration);

                                T1.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                                T1.show();

                        LayoutInflater L1 = getLayoutInflater();


                        View layout = L1.inflate(R.layout.customtoast, (ViewGroup)
                                findViewById(R.id.custom_toast_layout));


                        Toast Cust_T1 = new Toast(getApplicationContext());

                                Cust_T1.setDuration(Toast.LENGTH_SHORT);
                                Cust_T1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                                Cust_T1.setView(layout);
                                Cust_T1.show();


                        int x  = Integer.parseInt(ET1.getText().toString());
                        int y  = Integer.parseInt(ET2.getText().toString());


                        Intent INT1 = new Intent(MainActivity.this, SecondActivity.class);

                                INT1.putExtra("number1", x);
                                INT1.putExtra("number2", y);

                        startActivity(INT1);

                    }
                }
        );
    }



}