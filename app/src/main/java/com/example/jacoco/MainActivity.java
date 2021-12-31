package com.example.jacoco;

import org.jacoco.agent.rt.CodeCoverageManager;

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
            doSomething();
        });

        findViewById(R.id.bt).setOnClickListener(v -> {
            CodeCoverageManager.generateCoverageFile();
        });
    }

    private void doSomething(){
        mJojoDemo.getName();
        mJojoDemo.dos();
    }
}