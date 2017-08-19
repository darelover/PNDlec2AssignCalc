package com.example.atulsachdeva.pndlec2assigncalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.sum;

public class MainActivity extends AppCompatActivity {

    TextView tvInputOne, tvInputTwo, tvResult;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInputOne = (TextView) findViewById(R.id.tvInputOne);
        tvInputTwo = (TextView) findViewById(R.id.tvInputTwo);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double inputOne = Double.parseDouble(tvInputOne.getText().toString());
                Double inputTwo = Double.parseDouble(tvInputTwo.getText().toString());

                Double result = inputOne + inputTwo;
                tvResult.setText(result.toString());
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double inputOne = Double.parseDouble(tvInputOne.getText().toString());
                Double inputTwo = Double.parseDouble(tvInputTwo.getText().toString());

                Double result = inputOne - inputTwo;
                tvResult.setText(result.toString());
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double inputOne = Double.parseDouble(tvInputOne.getText().toString());
                Double inputTwo = Double.parseDouble(tvInputTwo.getText().toString());

                Double result = inputOne * inputTwo;
                tvResult.setText(result.toString());
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double inputOne = Double.parseDouble(tvInputOne.getText().toString());
                Double inputTwo = Double.parseDouble(tvInputTwo.getText().toString());

                if (inputTwo == 0)
                    tvResult.setText("You cannot divide by Zero");
                else {
                    Double result = inputOne / inputTwo;
                    tvResult.setText(result.toString());
                }
            }
        });
    }
}
