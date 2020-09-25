package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);
    }
    public void clickErro7(View view) {
        Intent intent7 = new Intent(getApplicationContext(), erro2.class);
    }
    public void clickTela7(View view){
        Intent intent14 = new Intent(getApplicationContext(), tela7.class);
    }
}