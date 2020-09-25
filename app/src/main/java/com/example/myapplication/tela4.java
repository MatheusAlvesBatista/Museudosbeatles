package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela4 extends AppCompatActivity {
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
    }
    public void clickErro5(View view) {
        Intent intent5 = new Intent(getApplicationContext(), erro2.class);
    }
    public void clickTela5(View view){
        Intent intent12 = new Intent(getApplicationContext(), tela5.class);
    }
}