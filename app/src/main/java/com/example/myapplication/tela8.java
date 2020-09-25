package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela8);
    }
    public void clickErro9(View view) {
        Intent intent9 = new Intent(getApplicationContext(), erro2.class);
    }
    public void clickTela9(View view){
        Intent intent16 = new Intent(getApplicationContext(), tela9.class);
    }
}