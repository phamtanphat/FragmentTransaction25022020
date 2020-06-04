package com.example.fragment25022020;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {

    View view;
    RelativeLayout mRlayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android, container, false);
        mRlayout = view.findViewById(R.id.relativeBackgroundAndroid);
        randomColorBackground();
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        return view;
    }
    private void randomColorBackground(){
        mRlayout.setBackgroundColor(
                Color.rgb(
                        new Random().nextInt(255),
                        new Random().nextInt(255),
                        new Random().nextInt(255)
                ));
    }
}
