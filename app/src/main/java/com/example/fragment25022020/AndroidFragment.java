package com.example.fragment25022020;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {

    View view;
    RelativeLayout mRlayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android, container, false);
        mRlayout = view.findViewById(R.id.relativeBackgroundAndroid);
        randomColorBackground();
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
