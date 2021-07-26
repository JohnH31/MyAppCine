package com.jherrera.myappcine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        img = findViewById(R.id.imgGrande);
        recibirDa();
    }
    private void recibirDa() {
        Bundle bundle = getIntent().getExtras();
        int imagen = bundle.getInt("imagenn");
        img.setImageResource(imagen);
    }
}