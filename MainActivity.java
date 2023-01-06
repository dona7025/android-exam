package com.example.sjcet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        t1=findViewById(R.id.t1);


    }



    public void add(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());

        int c = a + b;
        t1.setText(r.getText()).toSting();


    }

    public void sub(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());

        int c = a - b;
        t1.setText(r.getText()).toSting();


    }

    public void Div(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());

        int c = a * b;
        t1.setText(r.getText()).toSting();


    }

    public void Mult(View view) {
        int a = Integer.parseInt(et1.getText().toString());
        int b = Integer.parseInt(et2.getText().toString());

        int c = a / b;
        t1.setText(r.getText()).toSting();


    }

}
