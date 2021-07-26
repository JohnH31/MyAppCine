package com.jherrera.myappcine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText campoN,campoA,campoNi,campoB;
    private TextView tex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tex = findViewById(R.id.txtTotal);
        campoN = findViewById(R.id.txtNombre);
        campoA = findViewById(R.id.txtApellido);
        campoNi = findViewById(R.id.txtNit);
        campoB = findViewById(R.id.txtBoletos);
    }
    public void datos(){
        String nombre = campoN.getText().toString();
        String apellido = campoA.getText().toString();
        String nit = campoNi.getText().toString();
        String cantidad = campoB.getText().toString();
        if (!nombre.isEmpty()&&!apellido.isEmpty()&&!nit.isEmpty()&&!cantidad.isEmpty()){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            Toast.makeText(this,"Su compra Fue satisfactoria",Toast.LENGTH_SHORT).show();
            finish();
        }
        else {
            Toast.makeText(this,"Datos no ingresados",Toast.LENGTH_SHORT).show();
        }
    }

    public void resultado(){
        String cant = campoB.getText().toString();
        if (!cant.isEmpty()) {
            double multiplicacion = Integer.parseInt(cant) * 45;
            tex.setText("Total: Q"+multiplicacion);
        }else
            Toast.makeText(this,"Datos no ingresados",Toast.LENGTH_SHORT).show();
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRegresar:
                this.datos();
                break;
            case R.id.btnPresio:
                this.resultado();
                break;
        }
    }
}