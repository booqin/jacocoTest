package com.example.jacoco;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private JojoDemo mJojoDemo = new JojoDemo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.title).setOnClickListener(v -> {
            mJojoDemo.getName();
            mJojoDemo.dos();
        });

        findViewById(R.id.bt).setOnClickListener(v -> {
            JacocoUtils.generateEcFile(true);
        });
    }
}