package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }
    public void clickErro3(View view) {
        Intent intent4 = new Intent(getApplicationContext(), erro2.class);
    }
    public void clickTela4(View view){
        Intent intent11 = new Intent(getApplicationContext(), tela4.class);
    }
}