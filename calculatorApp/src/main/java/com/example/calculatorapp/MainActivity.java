package com.example.calculatorapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public void doComputation(View view) {
        try {
            EditText etNum1 = (EditText) findViewById(R.id.etNum1);
            EditText etNum2 = (EditText) findViewById(R.id.etNum2);
            TextView tvResult = (TextView) findViewById(R.id.tvResult);

            Double num1 = Double.parseDouble(etNum1.getText().toString());
            Double num2 = Double.parseDouble(etNum2.getText().toString());


            switch (view.getId()) {
                case R.id.btnAdd:
                    tvResult.setText("" + (num1 + num2));
                    tvResult.setTextColor(Color.BLACK);
                    break;
                case R.id.btnSub:
                    tvResult.setText("" + (num1 - num2));
                    tvResult.setTextColor(Color.BLACK);
                    break;
                case R.id.btnMul:
                    tvResult.setText("" + (num1 * num2));
                    tvResult.setTextColor(Color.BLACK);
                    break;
                case R.id.btnDiv:
                    if (num2 == 0) {
                        tvResult.setText("Cannot divide by zero");
                        tvResult.setTextColor(Color.RED);
                    } else {
                        tvResult.setText("" + (num1 / num2));
                        tvResult.setTextColor(Color.BLACK);
                    }
                    break;
                case R.id.btnMod:
                    tvResult.setText("" + (num1 % num2));
                    tvResult.setTextColor(Color.BLACK);
                    break;

            }
        } catch (Exception ex) {
            TextView tvResult = (TextView) findViewById(R.id.tvResult);
            tvResult.setText("Please enter both numbers");
            tvResult.setTextColor(Color.RED);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
