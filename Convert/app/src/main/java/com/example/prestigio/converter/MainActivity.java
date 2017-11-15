package com.example.prestigio.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.StringCharacterIterator;
import java.util.function.DoubleToIntFunction;

public class MainActivity extends AppCompatActivity {
    private EditText foots;
    private TextView meters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foots  = (EditText) findViewById(R.id.foots);
        meters  = (TextView) findViewById(R.id.meters);
    }
    public void convertValue(View view){
        double f,m;
        // Преобразуем текст в строку
        String S1 = foots.getText().toString();
        // Преобразуем строку в число
        f = Double.parseDouble(S1);
        // Выполняем операцию конвертирования
        m = f * 0.305;
        //Преобразуем ответ в число
        String S = Double.toString(m);
        //Выведем текст в textView
        meters.setText(S);

    }


}
