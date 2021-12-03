package com.example.covadongapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OPqr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opqr);
    }



    public void cancelar(View view ){
        Intent cancelar = new Intent(this, Home1.class);
        startActivity(cancelar);
        finish();
    }

    public void escanear(View view ){
        Intent escanear = new Intent(this, escaner.class);
        startActivity(escanear);
        finish();
    }
}