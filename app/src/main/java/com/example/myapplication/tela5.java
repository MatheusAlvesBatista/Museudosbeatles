package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
    }
    public void clickErro6(View view) {
        Intent intent6 = new Intent(getApplicationContext(), erro2.class);
    }
    public void clickTela6(View view){
        Intent intent13 = new Intent(getApplicationContext(), tela6.class);
    }
}