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

        ((Button) findViewById(R.id.btnCompute)).setOnClickListener(v -> {
            String expr = tvInput.getText().toString();
            int n = 0;
            for (int i=0; i<expr.length(); i++) {
                if (expr.charAt(i) == '+' || expr.charAt(i) == '-' || expr.charAt(i) == '×' || expr.charAt(i) == '/')
                    n++;
            }
            try {
                double ans = computeFromExpr(expr, n+1);
                ((TextView) findViewById(R.id.tvResult)).setText(Double.toString(ans));
            } catch (Exception e) {
                ((TextView) findViewById(R.id.tvResult)).setText("\uD83E\uDD21");
            }
        });
    }

    private double computeFromExpr(String expr, int n) throws Exception {
        double n1;
        StringBuilder temp1 = new StringBuilder(64);

        if (n == 1) {
            return Double.parseDouble(expr);
        }

        int j = 0;
        while (expr.charAt(j) != '+' && expr.charAt(j) != '-' && expr.charAt(j) != '×' && expr.charAt(j) != '/') {
            temp1.append(expr.charAt(j));
            j++;
        }
        n1 = Double.parseDouble(new String(temp1));

        switch(expr.charAt(j)) {
            case '+':
                n1 = n1 + computeFromExpr(expr.substring(j+1), n-1);
                break;
            case '-':
                n1 = n1 - computeFromExpr(expr.substring(j+1), n-1);
                break;
            case '×':
                n1 = n1 * computeFromExpr(expr.substring(j+1), n-1);
                break;
            case '/':
                n1 = n1 / computeFromExpr(expr.substring(j+1), n-1);
                break;
        }

        return n1;
    }
}