package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    private TextView TextField1, TextField2;
    String TextFieldOne = "", TextFieldTwo = "", ex = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextField1 = (TextView) findViewById(R.id.TextField1);
        TextField2 = (TextView) findViewById(R.id.TextField2);
        Button MC = (Button) findViewById(R.id.ButtonMC);
        Button MR = (Button) findViewById(R.id.ButtonMR);
        Button MS = (Button) findViewById(R.id.ButtonMS);
        Button Mp = (Button) findViewById(R.id.ButtonMp);
        Button Mm = (Button) findViewById(R.id.ButtonMm);
        Button Back = (Button) findViewById(R.id.ButtonBack);
        Button PM = (Button) findViewById(R.id.ButtonPM);
        Button ButtonC = (Button) findViewById(R.id.ButtonC);
        Button ButtonSeven = (Button) findViewById(R.id.ButtonSeven);
        Button ButtonEight = (Button) findViewById(R.id.ButtonEight);
        Button ButtonNine = (Button) findViewById(R.id.ButtonNine);
        Button ButtonRoot = (Button) findViewById(R.id.ButtonRoot);
        Button ButtonFraction = (Button) findViewById(R.id.ButtonFraction);
        Button ButtonFour = (Button) findViewById(R.id.ButtonFour);
        Button ButtonFive = (Button) findViewById(R.id.ButtonFive);
        Button ButtonSix = (Button) findViewById(R.id.ButtonSix);
        Button ButtonPlus = (Button) findViewById(R.id.ButtonPlus);
        Button ButtonMultiply = (Button) findViewById(R.id.ButtonMultiply);
        Button ButtonOne = (Button) findViewById(R.id.ButtonOne);
        Button ButtonTwo = (Button) findViewById(R.id.ButtonTwo);
        Button ButtonThree = (Button) findViewById(R.id.ButtonThree);
        Button ButtonMinus = (Button) findViewById(R.id.ButtonMinus);
        Button ButtonShare = (Button) findViewById(R.id.ButtonShare);
        Button ButtonNull = (Button) findViewById(R.id.ButtonNull);
        Button ButtonDot = (Button) findViewById(R.id.ButtonDot);
        Button ButtonEquals = (Button) findViewById(R.id.ButtonEquals);




        ButtonNull.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "0";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "1";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "2";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "3";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "4";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "5";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "6";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "7";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "8";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "9";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "+";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "-";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "*";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonShare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + "/";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = "";
                TextFieldTwo = "";
                TextField1.setText(TextFieldOne);
                TextField2.setText(TextFieldTwo);
            }
        });
        ButtonDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextFieldOne = TextFieldOne + ".";
                TextField1.setText(TextFieldOne);
            }
        });
        ButtonEquals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Expression e = new ExpressionBuilder(TextFieldOne).build();
                double Result = e.evaluate();
                String ResultF = Double.toString(Result);
                TextField2.setText(ResultF);
            }
        });
    }
}