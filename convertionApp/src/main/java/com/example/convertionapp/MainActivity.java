package com.example.convertionapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Spinner spUnits;
    private EditText etUnit;
    private TextView tvInch;
    private TextView tvCm;
    private  TextView tvMetre;
    private  TextView tvMile;
    private TextView tvKm;
    private  TextView tvMm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spUnits = (Spinner) findViewById(R.id.spUnits);
        etUnit = (EditText) findViewById(R.id.etUnit);
        tvInch = (TextView) findViewById(R.id.tvInch);
        tvCm = (TextView)findViewById(R.id.tvCm);
        tvMetre = (TextView)findViewById(R.id.tvMetre);
        tvMile = (TextView)findViewById(R.id.tvMile);
        tvKm = (TextView)findViewById(R.id.tvKm);
        tvMm = (TextView)findViewById(R.id.tvMm);
    }

    public void doUnitConversion(View view) {
        try {
        Double unit = Double.parseDouble(etUnit.getText().toString());

            switch (spUnits.getSelectedItem().toString()) {
                case "Inch":
                    tvInch.setText(unit + " inch");
					tvCm.setText((unit*1.25)+" cm");
					tvMetre.setText((unit/39.37)+" metres");
					tvMile.setText((unit*1000)+" miles");
					tvKm.setText((unit*0.0000254)+" km");
					tvMm.setText((unit*25.4)+" mm");
                    break;
                case "Centimetre":
					tvInch.setText((unit*0.393701)+" inches");
					tvCm.setText(unit+" cm");
					tvMetre.setText((unit*0.01)+" metres");
					tvMile.setText((unit*0.00000621371)+" miles");
					tvKm.setText((unit*0.00001)+" km");
					tvMm.setText((unit*10)+" mm");
                    break;
                case "Metre":
					tvInch.setText((unit*39.3701)+" inches");
					tvCm.setText((unit*100)+" cm");
					tvMetre.setText(unit+" metres");
					tvMile.setText((unit*0.000621371)+" miles");
					tvKm.setText((unit*0.001)+" km");
					tvMm.setText((unit*1000)+" mm");
                    break;
                case "Mile":
					tvInch.setText((unit*63360)+" inches");
					tvCm.setText((unit*160934)+" cm");
					tvMetre.setText((unit*1609.34)+" metres");
					tvMile.setText((unit+" miles"));
					tvKm.setText((unit*1.60934)+" km");
					tvMm.setText((unit*1609344)+" mm");
                    break;
                case "Kilometre":
					tvInch.setText((unit*39370.1)+" inches");
					tvCm.setText((unit*100000)+" cm");
					tvMetre.setText((unit*1000)+" metres");
					tvMile.setText((unit*0.621371)+" miles");
					tvKm.setText(unit+" km");
					tvMm.setText((unit*1000000)+" mm");
                    break;
                case "Millimetre":
					tvInch.setText((unit*0.0393701)+" inches");
					tvCm.setText((unit*0.1)+" cm");
					tvMetre.setText((unit*0.001)+" metres");
					tvMile.setText((unit*0.0000006213)+" miles");
					tvKm.setText((unit*0.000001)+" km");
					tvMm.setText(unit+" mm");
                    break;
            }
        } catch (Exception ex) {
            Toast.makeText(getBaseContext(), "Please enter a valid value to convert", Toast.LENGTH_SHORT).show();
        }
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
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }
}
