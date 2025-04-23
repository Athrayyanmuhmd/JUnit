package com.example.tugasjunit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasjunit.R;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView resultTextView;
    private Button addButton;
    private Button subtractButton;

    private com.example.simplecalculator.Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize calculator
        calculator = new com.example.simplecalculator.Calculator();

        // Find views
        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        resultTextView = findViewById(R.id.resultTextView);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);

        // Set click listeners
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate(true);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate(false);
            }
        });
    }

    private void calculate(boolean isAddition) {
        try {
            int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

            int result;
            if (isAddition) {
                result = calculator.add(firstNumber, secondNumber);
                resultTextView.setText(String.format("%d + %d = %d", firstNumber, secondNumber, result));
            } else {
                result = calculator.subtract(firstNumber, secondNumber);
                resultTextView.setText(String.format("%d - %d = %d", firstNumber, secondNumber, result));
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
        }
    }
}