package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /*
    Eğer bir görünüm tanımlayacaksak; sınıfın altında tanımlayıp, OnCreate altında findViewById'sini yazmak
    bize bunu tüm metotlarda kullanabilmemizi sağlar

     */


    EditText firstNumber;
    EditText secondNumber;
    TextView result ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText OnCreate'de çalışsın diye EditText tanımlamarını burda tanımlamaları yaptık
        firstNumber = (EditText) findViewById(R.id.editText);
        secondNumber = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.textView);




    }

    public void sum(View view){
        //girilen sayi boşsa uyar, değilse devam et
        if(firstNumber.getText().toString().matches("") || secondNumber.getText().toString().matches("")){
            result.setText("Enter a number!");
        }else{
            int myFirstNumber = Integer.parseInt(firstNumber.getText().toString());
            int mySecondNumber = Integer.parseInt(secondNumber.getText().toString());

            result.setText("Result: " + (myFirstNumber+mySecondNumber));
        }



    }
    public void deduct(View view){
        //girilen sayi boşsa uyar, değilse devam et
        if(firstNumber.getText().toString().matches("") || secondNumber.getText().toString().matches("")){
            result.setText("Enter a number!");
        }else{
            int myFirstNumber = Integer.parseInt(firstNumber.getText().toString());
            int mySecondNumber = Integer.parseInt(secondNumber.getText().toString());

            result.setText("Result: " + (myFirstNumber-mySecondNumber));
        }

    }
    public void multiply(View view){
        //girilen sayi boşsa uyar, değilse devam et
        if(firstNumber.getText().toString().matches("") || secondNumber.getText().toString().matches("")){
            result.setText("Enter a number!");
        }else{
            int myFirstNumber = Integer.parseInt(firstNumber.getText().toString());
            int mySecondNumber = Integer.parseInt(secondNumber.getText().toString());

            result.setText("Result: " + (myFirstNumber*mySecondNumber));
        }

    }
    public void divide(View view){
        //girilen sayi boşsa uyar, değilse devam et
        if(firstNumber.getText().toString().matches("") || secondNumber.getText().toString().matches("")){
            result.setText("Enter a number!");
        }else{
            int myFirstNumber = Integer.parseInt(firstNumber.getText().toString());
            int mySecondNumber = Integer.parseInt(secondNumber.getText().toString());

            result.setText("Result: " + (myFirstNumber/mySecondNumber));
        }

    }
}
