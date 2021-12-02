package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button Add;
    private TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.NUmber1);
        num2 = (EditText)findViewById(R.id.NUmber2);
        Add = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.textView);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Number1 = Integer.parseInt(num1.getText().toString());
                int Number2 = Integer.parseInt(num2.getText().toString());
                int Add = Number1 + Number2;
                result.setText("Answer:  "+String.valueOf(Add));
            }
        });
    }
}
