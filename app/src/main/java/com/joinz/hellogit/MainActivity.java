package com.joinz.hellogit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TEXTVIEW_STATE_KEY = "TEXTVIEW_STATE_KEY";
    private TextView textView;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate called");

        textView = findViewById(R.id.textView1);
        counter++;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestart called");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey(TEXTVIEW_STATE_KEY)) {
            counter = savedInstanceState.getInt(TEXTVIEW_STATE_KEY);
            textView.setText("Количество переворотов экрана " + counter);
        }
        counter++;
        Log.d("TAG", "onRestoreInstanceState called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("TEXTVIEW_STATE_KEY", counter);
        Log.d("TAG", "onSaveInstanceState called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop called");
    }

}
