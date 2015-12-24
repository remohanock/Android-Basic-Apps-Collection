package com.example.benchmarkingapp;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static Integer[] array;
    private EditText etSize;
    private TextView tvStatus;
    private RadioGroup rgCase;
    private TextView tvBubble;
    private TextView tvSelection;
    private TextView tvInsertion;
    private TextView tvMerge;
    private TextView tvQuick;
    private TextView tvHeap;
    private Button btnBubble;
    private Button btnSelection;

    private SensorManager mSensorManager;
    private float mAccel; // acceleration apart from gravity
    private float mAccelCurrent; // current acceleration including gravity
    private float mAccelLast; // last acceleration including gravity

    private final SensorEventListener mSensorListener = new SensorEventListener() {

        public void onSensorChanged(SensorEvent se) {
            float x = se.values[0];
            float y = se.values[1];
            float z = se.values[2];
            mAccelLast = mAccelCurrent;
            mAccelCurrent = (float) Math.sqrt((double) (x * x + y * y + z * z));
            float delta = mAccelCurrent - mAccelLast;
            mAccel = mAccel * 0.9f + delta; // perform low-cut filter
        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        mSensorManager.unregisterListener(mSensorListener);
        super.onPause();
    }


    public void doCalculations(View view) {

        int arraySize = 0;
        try {
            arraySize = Integer.parseInt(etSize.getText().toString());
            switch (view.getId()) {
                case R.id.btnGenerate:
                    array = new Integer[arraySize];
                    switch (rgCase.getCheckedRadioButtonId()) {
                        case R.id.rdBest:
                            tvStatus.setText("A sorted array of size " + arraySize + " is generated successfully");
                            array = Calculator.generateNaturalNumbers(arraySize);
                            break;
                        case R.id.rdAverage:
                            tvStatus.setText("A random array of size " + arraySize + " is generated successfully");
                            array = Calculator.generateRandomNumbers(arraySize);
                            break;
                        case R.id.rdWorst:
                            tvStatus.setText("An array in descending order of size " + arraySize + " is generated successfully");
                            array = Calculator.generateNaturalNumbersDescending(arraySize);
                            break;
                    }
                    break;
                case R.id.btnBubble:
                    Animation animation = AnimationUtils.loadAnimation(this, R.anim.shakeanimation);
                    btnBubble.startAnimation(animation);
                    BubbleSortTask bubbleSortTask = new BubbleSortTask(this);
                    bubbleSortTask.execute(array);
                    break;

                case R.id.btnInsertion:
                    Integer[] insertionArray = Calculator.cloneArray(array);
                    long iStart = System.currentTimeMillis();
                    Calculator.insertionSortArray(insertionArray);
                    tvInsertion.setText("" + (System.currentTimeMillis() - iStart) + " millisec");
                    break;

                case R.id.btnSelection:
                    Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.translateanimation);
                    btnSelection.startAnimation(animation1);
                    SelectionSortTask selectionTask = new SelectionSortTask(this);
                    selectionTask.execute(array);
                    break;

                case R.id.btnMerge:
                    Integer[] mergeArray = Calculator.cloneArray(array);
                    long mStart = System.currentTimeMillis();
                    Calculator.mergeSort(mergeArray);
                    tvMerge.setText("" + (System.currentTimeMillis() - mStart) + " millisec");
                    break;

                case R.id.btnQuick:
                    Integer[] quickArray = Calculator.cloneArray(array);
                    long qStart = System.currentTimeMillis();
                    Calculator.quickSort(quickArray, 1, quickArray.length - 1);
                    tvQuick.setText("" + (System.currentTimeMillis() - qStart) + " millisec");
                    break;

                case R.id.btnHeap:
                    Integer[] heapArray = Calculator.cloneArray(array);
                    long hStart = System.currentTimeMillis();
                    Calculator.heapSort(heapArray);
                    tvHeap.setText("" + (System.currentTimeMillis() - hStart) + " millisec");
                    break;
            }
        } catch (Exception ex) {
            tvStatus.setText("Enter valid array size please...");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSize = (EditText) findViewById(R.id.etSize);
        rgCase = (RadioGroup) findViewById(R.id.radioGroup1);
        tvStatus = (TextView) findViewById(R.id.tvStatus);
        tvBubble = (TextView) findViewById(R.id.tvBubble);
        tvSelection = (TextView) findViewById(R.id.tvSelection);
        tvInsertion = (TextView) findViewById(R.id.tvInsertion);
        tvMerge = (TextView) findViewById(R.id.tvMerge);
        tvQuick = (TextView) findViewById(R.id.tvQuick);
        tvHeap = (TextView) findViewById(R.id.tvHeap);
        btnBubble = (Button)findViewById(R.id.btnBubble);
        btnSelection = (Button)findViewById(R.id.btnSelection);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        mAccel = 0.00f;
        mAccelCurrent = SensorManager.GRAVITY_EARTH;
        mAccelLast = SensorManager.GRAVITY_EARTH;
        if (mAccel > 2) {
            Toast.makeText(getBaseContext(), "Array generated", Toast.LENGTH_LONG).show();
            Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
            vibrator.vibrate(500);
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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
