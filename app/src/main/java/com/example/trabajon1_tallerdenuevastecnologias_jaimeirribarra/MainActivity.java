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
    private float fnota1,fnota2,fnota3,fresultado;

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
                intentCalc.putExtra("nombre",Textnombre.getText().toString());
                intentCalc.putExtra("carrera",TextCarrera.getText().toString());
                intentCalc.putExtra("resultado", fresultado);

                fnota1=Float.parseFloat(nota1.getText().toString());
                fnota2=Float.parseFloat(nota2.getText().toString());
                fnota3=Float.parseFloat(nota3.getText().toString());


               MainActivity.this.fresultado = (fnota1+fnota2+fnota3)/3;

                startActivity(intentCalc);
            }
        });
    }
}