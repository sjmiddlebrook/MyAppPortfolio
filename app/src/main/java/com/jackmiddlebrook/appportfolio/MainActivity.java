package com.jackmiddlebrook.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.streamer_button:
                showToast(((Button) view).getText().toString());
                break;
            case R.id.scores_button:
                showToast(((Button) view).getText().toString());
                break;
            case R.id.library_button:
                showToast(((Button) view).getText().toString());
                break;
            case R.id.bigger_button:
                showToast(((Button) view).getText().toString());
                break;
            case R.id.xyz_button:
                showToast(((Button) view).getText().toString());
                break;
            case R.id.capstone_button:
                showToast(((Button) view).getText().toString());
                break;
        }
    }

    private void showToast(String appName) {

        //Stop any previous toasts
        if (mAppToast != null) {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(getApplicationContext(), "This button will launch my " + appName + " app",
                Toast.LENGTH_SHORT);
        mAppToast.show();

    }
}
