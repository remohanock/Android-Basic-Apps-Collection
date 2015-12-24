package com.example.remo.rlauncher;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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
        switch (id){
            case R.id.action_settings:
                Toast settingsToast = Toast.makeText(getBaseContext(),"You've clicked settings!",Toast.LENGTH_SHORT);
                settingsToast.setGravity(Gravity.TOP, 0, 0);
                settingsToast.show();
                break;
            case R.id.action_help:
                Toast helpToast = Toast.makeText(getBaseContext(),"Please call me for help",Toast.LENGTH_LONG);
                helpToast.setGravity(Gravity.RIGHT,0,0);
                helpToast.show();
                break;
            case R.id.action_about:
                Intent intent = new Intent(getBaseContext(),About_App.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
