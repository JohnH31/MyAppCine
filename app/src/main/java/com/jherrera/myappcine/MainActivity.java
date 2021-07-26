package com.jherrera.myappcine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ArrayList<DatosVO> listVO = new ArrayList<>();
    private ArrayList<DatosVO> listVO2 = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Cartelera");
        recyclerView = findViewById(R.id.recyclerID);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.insertarDatos();
        this.insetarInformacion();
        AdaptadorRecycler adaptadorRecycler = new AdaptadorRecycler(listVO);
        adaptadorRecycler.setOnItemClickListener(new AdaptadorRecycler.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(),MainActivity2.class);
                        intent.putExtra("imagen",listVO.get(position).getImagen());
                        intent.putExtra("texto1",listVO.get(position).getTexto1());
                        intent.putExtra("sinopsis",listVO2.get(position).getSinopsis());
                        intent.putExtra("director",listVO2.get(position).getDirector());
                        intent.putExtra("puntuacion",listVO2.get(position).getPuntuacion());
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(),MainActivity2.class);
                        intent.putExtra("imagen",listVO.get(position).getImagen());
                        intent.putExtra("texto1",listVO.get(position).getTexto1());
                        intent.putExtra("sinopsis",listVO2.get(position).getSinopsis());
                        intent.putExtra("director",listVO2.get(position).getDirector());
                        intent.putExtra("puntuacion",listVO2.get(position).getPuntuacion());
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(),MainActivity2.class);
                        intent.putExtra("imagen",listVO.get(position).getImagen());
                        intent.putExtra("texto1",listVO.get(position).getTexto1());
                        intent.putExtra("sinopsis",listVO2.get(position).getSinopsis());
                        intent.putExtra("director",listVO2.get(position).getDirector());
                        intent.putExtra("puntuacion",listVO2.get(position).getPuntuacion());
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(),MainActivity2.class);
                        intent.putExtra("imagen",listVO.get(position).getImagen());
                        intent.putExtra("texto1",listVO.get(position).getTexto1());
                        intent.putExtra("sinopsis",listVO2.get(position).getSinopsis());
                        intent.putExtra("director",listVO2.get(position).getDirector());
                        intent.putExtra("puntuacion",listVO2.get(position).getPuntuacion());
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(),MainActivity2.class);
                        intent.putExtra("imagen",listVO.get(position).getImagen());
                        intent.putExtra("texto1",listVO.get(position).getTexto1());
                        intent.putExtra("sinopsis",listVO2.get(position).getSinopsis());
                        intent.putExtra("director",listVO2.get(position).getDirector());
                        intent.putExtra("puntuacion",listVO2.get(position).getPuntuacion());
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(),MainActivity2.class);
                        intent.putExtra("imagen",listVO.get(position).getImagen());
                        intent.putExtra("texto1",listVO.get(position).getTexto1());
                        intent.putExtra("sinopsis",listVO2.get(position).getSinopsis());
                        intent.putExtra("director",listVO2.get(position).getDirector());
                        intent.putExtra("puntuacion",listVO2.get(position).getPuntuacion());
                        startActivity(intent);
                        break;
                }
            }
        });
        recyclerView.setAdapter(adaptadorRecycler);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
        }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                Toast.makeText(this,"Lista de Peliculas",Toast.LENGTH_SHORT).show();
                //img.setImageResource(R.drawable.online_shopping);
                break;
            case R.id.item2:
                recyclerView.setLayoutManager(new GridLayoutManager(this,2));
                Toast.makeText(this,"Lista Cuadrada de Peliculas",Toast.LENGTH_SHORT).show();
                //img.setImageResource(R.drawable.shopping);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    public void insertarDatos(){
        listVO.add(new DatosVO(R.drawable.elfaro,"El Faro","1h 53m"));
        listVO.add(new DatosVO(R.drawable.milnuevediezysiete,"1917","2h 30m"));
        listVO.add(new DatosVO(R.drawable.onward,"Onward","2h 22m"));
        listVO.add(new DatosVO(R.drawable.vidaoculta,"Vida Oculta","1h 44m"));
        listVO.add(new DatosVO(R.drawable.lacamarista,"La Camarista","1h 50m"));
        listVO.add(new DatosVO(R.drawable.sinonimos,"Sinonimos","1h 30m"));
    }
    public void insetarInformacion() {
        listVO2.add(new DatosVO(R.string.sinopsis1, R.string.puntuacion1, R.string.director1));
        listVO2.add(new DatosVO(R.string.sinopsis2, R.string.puntuacion2, R.string.director2));
        listVO2.add(new DatosVO(R.string.sinopsis3, R.string.puntuacion3, R.string.director3));
        listVO2.add(new DatosVO(R.string.sinopsis4, R.string.puntuacion4, R.string.director4));
        listVO2.add(new DatosVO(R.string.sinopsis5, R.string.puntuacion5, R.string.director5));
        listVO2.add(new DatosVO(R.string.sinopsis6, R.string.puntuacion6, R.string.director6));
    }
}