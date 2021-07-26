package com.jherrera.myappcine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img;
    private TextView tex1;
    private Fragment fragment1,fragment2,fragment3;
    private FragmentTransaction transaction;
    private int sinopsis,puntuacion,director;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fragment1 = new SinopsisFragment();
        fragment2 = new DirectorFragment();
        fragment3 = new PuntacionFragment();
        img = findViewById(R.id.imgCompra);
        tex1 = findViewById(R.id.txtCompra);
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorID,fragment1).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorID,fragment2).hide(fragment2).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorID,fragment3).hide(fragment3).commit();
        this.recibirDa();
        this.trasladarFrag1();
        this.trasladarFrag2();
        this.trasladarFrag3();
    }
    private void recibirDa(){
        Bundle bundle = getIntent().getExtras();
        int imagen = bundle.getInt("imagen");
        String text1 = bundle.getString("texto1");
        img.setImageResource(imagen);
        tex1.setText(text1);
        sinopsis = bundle.getInt("sinopsis");
        director = bundle.getInt("director");
        puntuacion = bundle.getInt("puntuacion");

    }
    private void trasladarFrag1(){
        Bundle bundle = new Bundle();
        bundle.putInt("sino",sinopsis);
        fragment1.setArguments(bundle);
    }
    private void trasladarFrag2(){
        Bundle bundle = new Bundle();
        bundle.putInt("dire",director);
        fragment2.setArguments(bundle);
    }
    private void trasladarFrag3(){
        Bundle bundle = new Bundle();
        bundle.putInt("pun",puntuacion);
        fragment3.setArguments(bundle);
    }

    public void onClick(View view) {
        transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.btnComprar:
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.imgCompra:
                Bundle bundle = getIntent().getExtras();
                int imagen = bundle.getInt("imagen");
                img.setImageResource(imagen);
                Intent intente = new Intent(getApplicationContext(),MainActivity4.class);
                intente.putExtra("imagenn", imagen);
                startActivity(intente);
                break;
            case R.id.btnSinopsis:
                if(fragment1.isAdded()){
                    transaction.hide(fragment2).hide(fragment3).show(fragment1);
                }
                else {
                    transaction.hide(fragment2).hide(fragment3).add(R.id.contenedorID,fragment1);
                    transaction.addToBackStack(null);
                }
                break;
            case R.id.btnDirector:
                if(fragment2.isAdded()){
                    transaction.hide(fragment1).hide(fragment3).show(fragment2);
                }
                else {
                    transaction.hide(fragment1).hide(fragment3).add(R.id.contenedorID,fragment2);
                    transaction.addToBackStack(null);
                }
                break;
            case R.id.btnPuntacion:
                if(fragment3.isAdded()){
                    transaction.hide(fragment2).hide(fragment1).show(fragment3);
                }
                else {
                    transaction.hide(fragment2).hide(fragment1).add(R.id.contenedorID,fragment3);
                    transaction.addToBackStack(null);
                }
                break;
        }
        transaction.commit();
    }
}