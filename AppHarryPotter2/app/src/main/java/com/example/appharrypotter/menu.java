package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    Button btnsair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnsair = findViewById(R.id.btnsair);
        btnsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    //Acesso a tela Home
    public void btnhomee(View view) {
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }

    //Acesso a tela Localização
    public void btnlocal(View view) {
        Intent intent = new Intent(this,localizacao.class);
        startActivity(intent);
    }
}