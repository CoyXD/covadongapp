package com.example.covadongapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.support.design.widget.Snackbar;
import android.support.design.widget.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.example.covadongapp.databinding.ActivityHome1Binding;

public class Home1 extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityHome1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHome1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarHome1.toolbar);
        binding.appBarHome1.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.perfiledit,R.id.calendario,R.id.contacto,R.id.info,R.id.cerrar)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home1);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home1, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home1);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void analisis(View view ){
        Intent analisis = new Intent(this, OPanalisis.class);
        startActivity(analisis);
        finish();
    }

    public void cita(View view ){
        Intent cita = new Intent(this, OPcita.class);
        startActivity(cita);
        finish();
    }

    public void docs(View view ){
        Intent docs = new Intent(this, OPdocs.class);
        startActivity(docs);
        finish();
    }

    public void videoc(View view ){
        Intent videoc = new Intent(this, OPvideoc.class);
        startActivity(videoc);
        finish();
    }

    public void codigoqr(View view ){
        Intent codigoqr = new Intent(this, OPqr.class);
        startActivity(codigoqr);
        finish();
    }

    public void emergencia(View view ){
        Intent emergencia = new Intent(this, OPemergencia.class);
        startActivity(emergencia);
        finish();
    }


}

