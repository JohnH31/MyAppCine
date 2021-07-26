package com.jherrera.myappcine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PuntacionFragment extends Fragment {

    private int puntuacionF1;

    public PuntacionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            puntuacionF1 = getArguments().getInt("pun");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_puntacion, container, false);
        TextView textView;
        textView = v.findViewById(R.id.txtPuntuacion);
        textView.setText(puntuacionF1);
        return v;
    }
}