package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void redButtonClick(View view) {
        // Получаем текстовое поле в текущей Activity
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Красный");
        textView.setTextColor(Color.RED);
    }
    public void greenButtonClick(View view) {
        // Получаем текстовое поле в текущей Activity
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Зеленый");
        textView.setTextColor(Color.GREEN);
    }
    public void blueButtonClick(View view) {
        // Получаем текстовое поле в текущей Activity
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Синий");
        textView.setTextColor(Color.BLUE);
    }
}