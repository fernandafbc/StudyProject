package com.fernandabraga.studyproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    Button buttonName;
    Button buttonCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initViews() {
        button = findViewById(R.id.btnContador);
        buttonName = findViewById(R.id.btnName);
        textView = findViewById(R.id.txtName);
        editText = findViewById(R.id.editTxt);
        buttonCalculator = findViewById(R.id.btnCalculadora);

    }

    @Override
    protected void onStart() {
        super.onStart();

        initViews();

        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContadorActivity.class);
            MainActivity.this.startActivity(intent);
        });

        buttonName.setOnClickListener(v -> {
            String name = editText.getText().toString();
            textView.setText(name);
        });

        buttonCalculator.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
            MainActivity.this.startActivity(intent);
        });

    }
}
