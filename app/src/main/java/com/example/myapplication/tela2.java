package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }
    public void clickErro2(View view) {
        Intent intent3 = new Intent(getApplicationContext(), erro2.class);
    }
    public void clickTela3(View view){
        Intent intent10 = new Intent(getApplicationContext(), tela3.class);
    }
    }