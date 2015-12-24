package com.example.benchmarkingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ActivityNavigator extends Activity {

    public static final String CALC_TYPE = "calcType" ;

    public void doNavigation(View view){
        switch (view.getId()){
            case R.id.btnCalc:
                Intent intent = new Intent(getBaseContext(),CalculatorActivity.class);
                intent.putExtra(CALC_TYPE, "Calculator App");
                startActivity(intent);
                break;
            case R.id.btnBenchmark:
                Intent intentBench = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intentBench);
                break;
            case R.id.btnTempConvert:
                Intent intentTemp = new Intent(getBaseContext(),TemperatureConversion.class);
                startActivity(intentTemp);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_navigator);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_navigator, menu);
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
