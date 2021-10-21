package com.example.trabajon1_tallerdenuevastecnologias_jaimeirribarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button BotonVolver;
    private String stNombre;
    private TextView TextLabelNombre;
    private String stCarrera;
    private TextView TextInfo;
    private TextView TextPromedio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle intentV=this.getIntent().getExtras();
        Float Resultado =intentV.getFloat("resultado");
        stCarrera=intentV.getString("carrera");
        stNombre=intentV.getString("nombre");

        TextLabelNombre=(TextView) findViewById(R.id.TextLabelNombre);
        TextPromedio=(TextView) findViewById(R.id.TextPromedio);
        TextInfo=(TextView) findViewById(R.id.TextInfo);
        TextPromedio=(TextView) findViewById(R.id.TextPromedio);
        TextPromedio.setText(Resultado.toString());

        Context context=getApplicationContext();

        TextLabelNombre.setText("Nombre del estudiante: "+ stNombre);
        TextPromedio.setText("Su promedio es: "+Resultado);
        TextInfo.setText("Estudiante: "+stNombre + " de la carrera "+stCarrera+ " Su promedio es: "+Resultado);

        BotonVolver = (Button) findViewById(R.id.buttonVolver);
        Intent intentVol=new Intent(this,MainActivity.class);

        if (intentV!=null){

            Toast.makeText(context,"Estudiante: "+stNombre + " de la carrera "+stCarrera+ " Su promedio es: "+Resultado,Toast.LENGTH_SHORT).show();
        }

        BotonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentVol);
            }
        });
    }
}