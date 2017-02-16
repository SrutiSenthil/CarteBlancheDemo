package com.figsandolives.carteblanchedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("CB", "In onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("CB", "In onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("CB", "In onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("CB", "In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("CB", "In onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("CB", "In onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("CB", "In onDestroy");
    }
}
