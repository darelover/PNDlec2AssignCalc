package com.example.atulsachdeva.pndlec2assigncalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.drawable.btn_default;
import static java.lang.Double.sum;

public class MainActivity extends AppCompatActivity {

    TextView tvInputOne, tvInputTwo, tvResult;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnEquals;

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
        btnEquals = (Button) findViewById(R.id.btnEquals);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnAdd.setBackgroundResource(R.color.selectedOperation);

                if (tvResult.getText().toString().length() > 0) {
                    Double result = Double.parseDouble(tvResult.getText().toString());
                    tvInputOne.setText(result.toString());
                    tvInputTwo.setText("");
                    tvResult.setText("");
                }

                btnEquals.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double inputOne = Double.parseDouble(tvInputOne.getText().toString());
                        Double inputTwo = Double.parseDouble(tvInputTwo.getText().toString());

                        Double result = inputOne + inputTwo;
                        tvResult.setText(result.toString());
                        btnAdd.setBackgroundResource(btn_default);
                    }
                });
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnSubtract.setBackgroundResource(R.color.selectedOperation);

                if (tvResult.getText().toString().length() > 0) {
                    Double result = Double.parseDouble(tvResult.getText().toString());
                    tvInputOne.setText(result.toString());
                    tvInputTwo.setText("");
                    tvResult.setText("");
                }

                btnEquals.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double inputOne = Double.parseDouble(tvInputOne.getText().toString());
                        Double inputTwo = Double.parseDouble(tvInputTwo.getText().toString());

                        Double result = inputOne - inputTwo;
                        tvResult.setText(result.toString());
                        btnSubtract.setBackgroundResource(btn_default);
                    }
                });
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnMultiply.setBackgroundResource(R.color.selectedOperation);

                if (tvResult.getText().toString().length() > 0) {
                    Double result = Double.parseDouble(tvResult.getText().toString());
                    tvInputOne.setText(result.toString());
                    tvInputTwo.setText("");
                    tvResult.setText("");
                }

                btnEquals.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double inputOne = Double.parseDouble(tvInputOne.getText().toString());
                        Double inputTwo = Double.parseDouble(tvInputTwo.getText().toString());

                        Double result = inputOne * inputTwo;
                        tvResult.setText(result.toString());
                        btnMultiply.setBackgroundResource(btn_default);
                    }
                });
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnDivide.setBackgroundResource(R.color.selectedOperation);

                if (tvResult.getText().toString().length() > 0) {
                    Double result = Double.parseDouble(tvResult.getText().toString());
                    tvInputOne.setText(result.toString());
                    tvInputTwo.setText("");
                    tvResult.setText("");
                }

                btnEquals.setOnClickListener(new View.OnClickListener() {
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
                        btnDivide.setBackgroundResource(btn_default);
                    }
                });
            }
        });


    }
}
