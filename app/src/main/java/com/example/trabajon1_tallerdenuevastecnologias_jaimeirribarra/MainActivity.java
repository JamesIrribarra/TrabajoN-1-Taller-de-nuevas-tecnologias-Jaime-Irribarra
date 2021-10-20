package com.example.trabajon1_tallerdenuevastecnologias_jaimeirribarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button Botoncalcular;
    private EditText Textnombre;
    private EditText TextCarrera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextCarrera = (EditText) findViewById(R.id.TextCarrera);
        Textnombre = (EditText) findViewById(R.id.TextNombre);
        Botoncalcular =(Button) findViewById(R.id.buttonCalcular);
        Intent intentCalc=new Intent(this,MainActivity2.class);
        Botoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentCalc.putExtra("nombre",Textnombre.getText().toString());
                intentCalc.putExtra("carrera",TextCarrera.getText().toString());
                startActivity(intentCalc);
            }
        });
    }
}