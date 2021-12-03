package com.example.covadongapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void iniciar(View view ){
        Intent iniciar = new Intent(this, CargandoUsuario.class);
        startActivity(iniciar);
        finish();
    }


}