package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela7);
    }
    public void clickErro8(View view) {
        Intent intent8 = new Intent(getApplicationContext(), erro2.class);
    }
    public void clickTela8(View view){
        Intent intent15 = new Intent(getApplicationContext(), tela8.class);
    }
}