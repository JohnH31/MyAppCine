package com.jherrera.myappcine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SinopsisFragment extends Fragment {

    private int sinopsisF1;

    public SinopsisFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            sinopsisF1 = getArguments().getInt("sino");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sinopsis, container, false);
        TextView textView;
        textView = v.findViewById(R.id.txtSinopsis);
        textView.setText(sinopsisF1);
        return v;
    }
}