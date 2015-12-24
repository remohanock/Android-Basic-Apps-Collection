package com.example.benchmarkingapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class TemperatureConversion extends Activity {

    private EditText etTemp;
    private RadioGroup rdTemp;
    private TextView tvResult;

    public void doConversion(View view) {
        try {
            double temperature = Double.parseDouble(etTemp.getText().toString());
            switch (rdTemp.getCheckedRadioButtonId()) {
                case R.id.rdFtoC:
                    tvResult.setText(etTemp.getText().toString()+ " F is equal to "+ ((temperature * 9/5) + 32)+" " +(char)0X00B0+"C");
                    break;
                case R.id.rdCtoF:
                    tvResult.setText(etTemp.getText().toString()+" " +(char)0X00B0+"C is equal to "+ + ((temperature - 32) * 5 / 9)+" F");
                    break;
            }
        }catch (Exception ex){
            Toast.makeText(getBaseContext(),"Enter a value for temperature",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_conversion);
        etTemp = (EditText) findViewById(R.id.etTemp);
        rdTemp = (RadioGroup) findViewById(R.id.rdTemp);
        tvResult = (TextView) findViewById(R.id.tvResult);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temperature_conversion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
