package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String count = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView setCount = findViewById(R.id.display_count);
        setCount.setText(count);
    }


}
