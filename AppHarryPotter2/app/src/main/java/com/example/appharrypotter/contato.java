package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class contato extends AppCompatActivity implements View.OnClickListener {

    //Declaração de variaveís
    Button exibir, enviar;
    EditText editname, editemail, editcoment;

    private String filename = "demoFile.txt";
    private String fileemail = "demoFilee.txt";
    private String filecoment = "demoFileee.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        exibir = findViewById(R.id.btnexibir);
        enviar = findViewById(R.id.btnenviar);
        editname = findViewById(R.id.name);
        editemail = findViewById(R.id.email);
        editcoment = findViewById(R.id.coment);

        exibir.setOnClickListener(this);
        enviar.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        Button b = (Button) view;

        String b_text = b.getText().toString();

        switch (b_text.toLowerCase()) {
            case "enviar": {
                exibirData();
                break;
            }
            case "exibir": {
                Intent intent = new Intent(this,resultcontato.class);
                startActivity(intent);
            }
        }
    }

    //Gravando os dados dentro do armazenamento interno
    public void printMessage(String m) {
        Toast.makeText(this, m, Toast.LENGTH_LONG).show();
    }
    private void exibirData() {

        try {
            FileOutputStream fos = openFileOutput(filename, Context.MODE_PRIVATE);
            FileOutputStream fos2 = openFileOutput(fileemail, Context.MODE_PRIVATE);
            FileOutputStream fos3 = openFileOutput(filecoment, Context.MODE_PRIVATE);

            String data = editname.getText().toString();
            String data2 = editemail.getText().toString();
            String data3 = editcoment.getText().toString();

            fos.write(data.getBytes());
            fos2.write(data2.getBytes());
            fos3.write(data3.getBytes());

            fos.flush();
            fos.close();

            fos2.flush();
            fos2.close();

            fos3.flush();
            fos3.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        editname.setText("");
        editemail.setText("");
        editcoment.setText("");

        //Mensagem exibida para o usuário após finalizar o processo que esta sendo execultado
        printMessage("Mensagem enviada com sucesso!");
    }
}