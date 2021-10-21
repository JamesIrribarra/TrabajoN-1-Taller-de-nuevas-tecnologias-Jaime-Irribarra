package com.example.trabajon1_tallerdenuevastecnologias_jaimeirribarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    private Button Botoncalcular;
    private EditText Textnombre;
    private EditText TextCarrera;
    private EditText nota1,nota2,nota3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextCarrera = (EditText) findViewById(R.id.TextCarrera);
        Textnombre = (EditText) findViewById(R.id.TextNombre);
        nota1 = (EditText) findViewById(R.id.TextNota1);
        nota2 = (EditText) findViewById(R.id.TextNota2);
        nota3 = (EditText) findViewById(R.id.TextNota3);

        Botoncalcular =(Button) findViewById(R.id.buttonCalcular);
        Intent intentCalc=new Intent(this,MainActivity2.class);
        Botoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float Resultado=(Float.parseFloat(nota1.getText().toString())+Float.parseFloat(nota2.getText().toString())+Float.parseFloat(nota3.getText().toString()))/3;
                intentCalc.putExtra("nombre",Textnombre.getText().toString());
                intentCalc.putExtra("carrera",TextCarrera.getText().toString());
                intentCalc.putExtra("resultado",Resultado);


                startActivity(intentCalc);
            }
        });
    }
}