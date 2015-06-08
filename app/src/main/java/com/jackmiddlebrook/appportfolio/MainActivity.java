package com.jackmiddlebrook.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

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

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.streamer_button:
                showToast("Spotify Streamer");
                break;
            case R.id.scores_button:
                showToast("Scores");
                break;
            case R.id.library_button:
                showToast("Library");
                break;
            case R.id.bigger_button:
                showToast("Build it Bigger");
                break;
            case R.id.xyz_button:
                showToast("XYZ Reader");
                break;
            case R.id.capstone_button:
                showToast("Capstone Project");
                break;
        }
    }

    private void showToast(String appName) {
        Toast.makeText(getApplicationContext(), "This button will launch my " + appName + " app",
                Toast.LENGTH_SHORT).show();
    }
}
