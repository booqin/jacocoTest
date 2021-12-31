package com.example.jacoco;

import org.jacoco.agent.rt.CodeCoverageManager;

import android.util.Log;
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
            funB();
        });

        findViewById(R.id.bt).setOnClickListener(v -> {
            CodeCoverageManager.generateCoverageFile();
        });
    }

    private void doSomething(){
        mJojoDemo.getName();
        mJojoDemo.dos();
    }

    private void funB(){
        int a = 1;
        Log.d("BQ", ""+a);
    }

    private String getJacoco(){
        return "jacoco";
    }
}