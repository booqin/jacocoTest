package com.example.jacoco;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private JojoDemo mJojoDemo = new JojoDemo();
    private KJacocoMain mKJacocoMain = new KJacocoMain();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.title).setOnClickListener(v -> {
            mJojoDemo.getName();
            mJojoDemo.dos();
            mKJacocoMain.getName();
        });

        findViewById(R.id.bt).setOnClickListener(v -> {
            JacocoUtils.generateEcFile(true);
        });
    }
}