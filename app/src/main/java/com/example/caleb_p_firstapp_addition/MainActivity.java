package com.example.caleb_p_firstapp_addition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                resultTextView.setText(getNum1() + getNum2() + "");

            }
        });
        Button subBtn = (Button) findViewById(R.id.subBtn);
        subBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                resultTextView.setText(getNum1() - getNum2() + "");
            }
        });
        Button mulBtn = (Button) findViewById(R.id.mulBtn);
        mulBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                resultTextView.setText(getNum1() * getNum2() + "");
            }
        });
        Button divBtn = (Button) findViewById(R.id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                resultTextView.setText(getNum1() / getNum2() + "");
            }
        });
        Button powBtn = (Button) findViewById(R.id.pow);
        powBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                resultTextView.setText(Math.pow(getNum1(),getNum2()) + "");
            }
        });
        Button sinBtn = (Button) findViewById(R.id.sinBtn);
        sinBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                resultTextView.setText(getNum1() *Math.sin(getNum2()) + "");
            }
        });

    }
    private double getNum1(){
        EditText num1 = (EditText) findViewById(R.id.firstNumEditText);

        return Double.parseDouble(num1.getText().toString());
    }
    private double getNum2(){
        EditText num2 = (EditText) findViewById(R.id.secondNumEditText);
        return Double.parseDouble(num2.getText().toString());
    }

}
