package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class personagem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem3);
    }

    //Acesso a tela de menu
    public void btnhome(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }
}