package com.example.covadongapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OPcita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcita);
    }


    public void cancelar(View view ){
        Intent cancelar = new Intent(this, Home1.class);
        startActivity(cancelar);
        finish();
    }
}