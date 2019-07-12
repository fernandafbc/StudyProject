package com.fernandabraga.studyproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContadorActivity extends AppCompatActivity {

    int count = 0;
    TextView firstText;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);
    }

    @Override
    protected void onStart() {
        super.onStart();

        button = findViewById(R.id.btnContador);
        firstText = findViewById(R.id.txtCount);

        button.setOnClickListener(v -> {
            count++;
            firstText.setText(String.valueOf(count));
        });
    }
}
