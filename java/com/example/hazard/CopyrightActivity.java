package com.example.hazard;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CopyrightActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.copyright);

        TextView copyrightText = findViewById(R.id.copyright_text);
        copyrightText.setText(getString(R.string.copyright_text));
    }
}
