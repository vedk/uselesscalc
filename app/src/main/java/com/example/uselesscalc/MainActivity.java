package com.example.uselesscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setOnClickListeners();
    }

    private void setOnClickListeners() {
        TextView tvInput = (TextView) findViewById(R.id.tvInput);

        ((Button) findViewById(R.id.btnZero)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "0");
        });

        ((Button) findViewById(R.id.btnOne)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "1");
        });

        ((Button) findViewById(R.id.btnTwo)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "2");
        });

        ((Button) findViewById(R.id.btnThree)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "3");
        });

        ((Button) findViewById(R.id.btnFour)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "4");
        });

        ((Button) findViewById(R.id.btnFive)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "5");
        });

        ((Button) findViewById(R.id.btnSix)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "6");
        });

        ((Button) findViewById(R.id.btnSeven)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "7");
        });

        ((Button) findViewById(R.id.btnEight)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "8");
        });

        ((Button) findViewById(R.id.btnNine)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "9");
        });

        ((Button) findViewById(R.id.btnPlus)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "+");
        });

        ((Button) findViewById(R.id.btnMinus)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "-");
        });

        ((Button) findViewById(R.id.btnMultiply)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "×");
        });

        ((Button) findViewById(R.id.btnDivide)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + "/");
        });

        ((Button) findViewById(R.id.btnDecimal)).setOnClickListener(v -> {
            tvInput.setText(tvInput.getText().toString() + ".");
        });

        ((Button) findViewById(R.id.btnAC)).setOnClickListener(v -> {
            tvInput.setText("");
        });
    }
}