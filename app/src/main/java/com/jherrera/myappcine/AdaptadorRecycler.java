package com.jherrera.myappcine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.ViewHolder> {
    private ArrayList<DatosVO> list = new ArrayList<>();
    private static ClickListener clickListener;

    public AdaptadorRecycler(ArrayList<DatosVO> list) {
        this.list = list;
    }

    @Override
    public AdaptadorRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,null,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRecycler.ViewHolder holder, int position) {
        holder.asignarDatos(list.get(position).getImagen(), list.get(position).getTexto1(),list.get(position).getTexto2());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView textView,textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            imageView = itemView.findViewById(R.id.imgR);
            textView = itemView.findViewById(R.id.txtNombreR);
            textView2 = itemView.findViewById(R.id.txtDuracionR);
        }
        public void asignarDatos(int img,String texto,String texto2){
            imageView.setImageResource(img);
            textView.setText(texto);
            textView2.setText(texto2);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(),v);
        }
    }
    public void setOnItemClickListener(ClickListener clickListener){
        AdaptadorRecycler.clickListener = clickListener;
    }

    public interface ClickListener{
        public void onItemClick(int position, View v);
    }
}
