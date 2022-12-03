package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.IOException;

public class resultcontato extends AppCompatActivity {

    //Declarando variaveís
    TextView fileContent, fileContentt, fileContenttt;

    private String filename = "demoFile.txt";
    private String fileemail = "demoFilee.txt";
    private String filecoment = "demoFileee.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultcontato);

        fileContent = findViewById(R.id.exibenome);
        fileContentt = findViewById(R.id.exibeemail);
        fileContenttt = findViewById(R.id.exibecoment);

        exibirData();
    }

    //Exibindo dados que foram armazenados
    private void exibirData() {
        try {
            FileInputStream fin = openFileInput(filename);
            FileInputStream finn = openFileInput(fileemail);
            FileInputStream finnn = openFileInput(filecoment);

            int a, b, c;
            StringBuilder temp = new StringBuilder();
            StringBuilder tempp = new StringBuilder();
            StringBuilder temppp = new StringBuilder();

            while ((a = fin.read()) != -1) {
                temp.append((char) a);
            }

            while ((b = finn.read()) != -1) {
                tempp.append((char) b);
            }

            while ((c = finnn.read()) != -1) {
                temppp.append((char) c);
            }

            fileContent.setText(temp.toString());
            fileContentt.setText(tempp.toString());
            fileContenttt.setText(temppp.toString());

            fin.close();
            finn.close();
            finnn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Acesso a tela de menu
    public void btnmenu(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }

    //Acesso a tela de home
    public void btnhome(View view) {
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }
}