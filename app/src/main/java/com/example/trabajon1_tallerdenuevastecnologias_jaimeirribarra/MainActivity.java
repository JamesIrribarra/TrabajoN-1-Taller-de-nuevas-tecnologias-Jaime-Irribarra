package com.example.trabajon1_tallerdenuevastecnologias_jaimeirribarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Botoncalcular;
    private EditText Textnombre;
    private EditText TextCarrera;
    private EditText Nota1,Nota2,Nota3;
    private double fNota1,fNota2,fNota3,fResultado;
    private TextView texResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texResultado=(TextView) findViewById(R.id.textResultado);
        Nota1=(EditText) findViewById(R.id.TextNota1);
        Nota2=(EditText) findViewById(R.id.TextNota2);
        Nota3=(EditText) findViewById(R.id.TextNota3);
        TextCarrera = (EditText) findViewById(R.id.TextCarrera);
        Textnombre = (EditText) findViewById(R.id.TextNombre);
        texResultado=(TextView) findViewById(R.id.textResultado);
        Botoncalcular =(Button) findViewById(R.id.buttonCalcular);
        Intent intentCalc=new Intent(this,MainActivity2.class);
        Botoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentCalc.putExtra("nombre",Textnombre.getText());
                intentCalc.putExtra("carrera",TextCarrera.getText());
                intentCalc.putExtra("resultado",texResultado.getText());

                fNota1=Double.parseDouble(Nota2.getText().toString());
                fNota2=Double.parseDouble(Nota2.getText().toString());
                fNota3=Double.parseDouble(Nota3.getText().toString());

                fResultado=(fNota1+fNota2+fNota3)/3.;
                texResultado.setText("" + fResultado);

                startActivity(intentCalc);
            }
        });
    }
}