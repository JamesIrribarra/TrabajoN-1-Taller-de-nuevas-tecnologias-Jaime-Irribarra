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
        TextLabelNombre=(TextView) findViewById(R.id.TextLabelNombre);
        TextPromedio=(TextView) findViewById(R.id.TextPromedio);
        TextInfo=(TextView) findViewById(R.id.TextInfo);
        Context context=getApplicationContext();

        Bundle intentV=this.getIntent().getExtras();
        if (intentV!=null){
            stCarrera=intentV.getString("carrera");
            stNombre=intentV.getString("nombre");
            Toast.makeText(context,"Estudiante: "+stNombre + " de la carrera "+stCarrera+ " Su promedio es: ",Toast.LENGTH_SHORT).show();
        }

        TextLabelNombre.setText("Nombre del estudiante: "+ stNombre);
        TextPromedio.setText("Su promedio es: ");
        TextInfo.setText("Estudiante: "+stNombre + " de la carrera "+stCarrera+ " Su promedio es: ");

        BotonVolver = (Button) findViewById(R.id.buttonVolver);
        Intent intentVol=new Intent(this,MainActivity.class);

        BotonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentVol);
            }
        });
    }
}