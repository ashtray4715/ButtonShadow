package com.ashtray.buttonshadow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "[GPMainActivity]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.image_button).setOnClickListener(view -> imageButtonClicked());
    }

    private void imageButtonClicked() {
        Log.d(TAG, "imageButtonClicked: handle it");
    }
}