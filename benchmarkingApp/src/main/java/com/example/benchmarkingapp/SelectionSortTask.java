package com.example.benchmarkingapp;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.TextView;

public class SelectionSortTask extends AsyncTask<Integer[], String, String> {

    Activity refToActivity;

    public SelectionSortTask(Activity activity) {
        refToActivity = activity;
    }

    private TextView tvSelection;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        tvSelection = (TextView) refToActivity.findViewById(R.id.tvSelection);
    }


    @Override
    protected String doInBackground(Integer[]... params) {

        Integer[] selectionArray = Calculator.cloneArray(params[0]);
        long sStart = System.currentTimeMillis();
        publishProgress("30");
        Calculator.selectionSortArray(selectionArray);
        publishProgress("60");
        long sStop = System.currentTimeMillis();
        publishProgress("90");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ("" + (sStop - sStart) + " milli sec");
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        tvSelection.setText(values[0] + "% completed...");
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        tvSelection.setText(s);
    }

}
