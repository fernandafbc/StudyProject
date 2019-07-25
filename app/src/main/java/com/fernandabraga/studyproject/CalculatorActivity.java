package com.fernandabraga.studyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    EditText edFirstNum, edSecondNum, edResult;
    int firstNum, secondNum, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    private void initViews() {
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMul = findViewById(R.id.btnMul);
        buttonDiv = findViewById(R.id.btnDiv);
        edFirstNum = findViewById(R.id.editFirstNumber);
        edSecondNum = findViewById(R.id.editSecondNumber);
        edResult = findViewById(R.id.editResult);

    }

    private boolean isEmpty(EditText edText) {
        if (edText.getText().toString().trim().length() > 0)
            return false;

        return true;
    }


    @Override
    protected void onStart() {
        super.onStart();

        initViews();


        buttonAdd.setOnClickListener(v -> {
            if(isEmpty(edFirstNum) || isEmpty(edSecondNum)){
                String text = "Números não podem ser vazios!";
                edResult.setText(text);
            } else {
                firstNum = Integer.parseInt(edFirstNum.getText().toString());
                secondNum = Integer.parseInt(edSecondNum.getText().toString());
                result = firstNum + secondNum;
                edResult.setText(String.valueOf(result));
            }
        });

        buttonSub.setOnClickListener(v -> {
            if(isEmpty(edFirstNum) || isEmpty(edSecondNum)){
                String text = "Números não podem ser vazios!";
                edResult.setText(text);
            } else {
                firstNum = Integer.parseInt(edFirstNum.getText().toString());
                secondNum = Integer.parseInt(edSecondNum.getText().toString());
                result = firstNum - secondNum;
                edResult.setText(String.valueOf(result));
            }
        });

        buttonMul.setOnClickListener(v -> {
            if(isEmpty(edFirstNum) || isEmpty(edSecondNum)){
                String text = "Números não podem ser vazios!";
                edResult.setText(text);
            } else {
                firstNum = Integer.parseInt(edFirstNum.getText().toString());
                secondNum = Integer.parseInt(edSecondNum.getText().toString());
                result = firstNum * secondNum;
                edResult.setText(String.valueOf(result));
            }
        });

        buttonDiv.setOnClickListener(v -> {
            if(isEmpty(edFirstNum) || isEmpty(edSecondNum)){
                String text = "Números não podem ser vazios!";
                edResult.setText(text);
            } else {
                firstNum = Integer.parseInt(edFirstNum.getText().toString());
                secondNum = Integer.parseInt(edSecondNum.getText().toString());
                result = firstNum / secondNum;
                edResult.setText(String.valueOf(result));
            }
        });



    }
}