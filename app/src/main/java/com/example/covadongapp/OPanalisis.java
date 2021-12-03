package com.example.covadongapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OPanalisis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opanalisis);
    }

    public void sacar(View view ){
        Intent sacar = new Intent(this, OPanalisis.class);
        startActivity(sacar);
        finish();
    }

    public void revisar(View view ){
        Intent revisar = new Intent(this, OPanalisis.class);
        startActivity(revisar);
        finish();
    }

    public void cancelar(View view ){
        Intent cancelar = new Intent(this, Home1.class);
        startActivity(cancelar);
        finish();
    }

}