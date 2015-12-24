package com.example.remo.jokesapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.sql.Array;
import java.util.Iterator;
import java.util.LinkedList;


public class MainActivity extends ActionBarActivity {



    public void nextJoke(View view){
        LinkedList<String> jokeList = new LinkedList<String>();
        Iterator<String> iterator = jokeList.iterator();
        jokeList.add(1,"Joke1");
        jokeList.add(2,"Joke2");
        jokeList.add(3,"Joke3");
        jokeList.add(4,"Joke4");
        jokeList.add(5,"Joke5");
        TextView tvJoke = (TextView)findViewById(R.id.tvJoke1);
        if (tvJoke.getText()==jokeList.getLast()){
            tvJoke.setText("Reached end of jokes! :(");
        }
        else {

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
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
