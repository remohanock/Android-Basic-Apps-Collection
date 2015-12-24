package com.example.benchmarkingapp;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.TextView;

public class BubbleSortTask extends AsyncTask<Integer[], String, String> {

    Activity refToActivity;
    private TextView tvBubble;

    public BubbleSortTask(Activity activity) {
        refToActivity = activity;
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        tvBubble.setText(values[0] + "% completed...");
    }

    @Override
    protected String doInBackground(Integer[]... params) {
        Integer[] bubbleArray = Calculator.cloneArray(params[0]);
        long bStart = System.currentTimeMillis();
        publishProgress("30");
        Calculator.bubbleSortArray(bubbleArray);
        publishProgress("60");
        long bStop = System.currentTimeMillis();
        publishProgress("90");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ("" + (bStop - bStart) + " milli sec");
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        tvBubble.setText(s);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        tvBubble = (TextView) refToActivity.findViewById(R.id.tvBubble);
    }
}
