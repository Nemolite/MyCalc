package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    int buf;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op = '1';
        buf = 0;
        txt = findViewById(R.id.textView);
        Button res = findViewById(R.id.button20);
        res.setOnClickListener(view ->{
            switch (op){
                case '+':
                    buf += Integer.parseInt(txt.getText().toString());
                    txt.setText(String.valueOf(buf));
                    break;
                case '-':
                    buf -= Integer.parseInt(txt.getText().toString());
                    txt.setText(String.valueOf(buf));
                    break;
                case '*':
                    buf *= Integer.parseInt(txt.getText().toString());
                    txt.setText(String.valueOf(buf));
                    break;
                case '/':
                    buf /= Integer.parseInt(txt.getText().toString());
                    txt.setText(String.valueOf(buf));
                    break;
            }
        });

    }
    public void oper(View view){
        buf = Integer.parseInt(txt.getText().toString());
        Button b =(Button) view;
        op = b.getText().charAt(0);
        txt.setText("");

    }

    public void appenedText(View view){
        Button b =(Button) view;
        txt.setText(txt.getText().toString() + b.getText().toString());
    }
}