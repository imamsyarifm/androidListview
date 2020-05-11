package com.example.cats;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.profil);

    if (getSupportActionBar() != null){
        getSupportActionBar().setTitle("Profil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
