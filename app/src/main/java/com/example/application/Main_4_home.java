package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main_4_home extends Fragment {
    public Main_4_home(){}
    private FloatingActionButton mFab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.activity_4_home, container, false);
        super.onCreate(savedInstanceState);


        mFab = (FloatingActionButton) view.findViewById(R.id.fab);
//        mFab.setOnClickListener(fabOnClick);

//        mFab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), Main_4_1_1.class);
//                startActivity(intent);
//            }
//        });

//        private final View.OnClickListener fabOnClick = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent myIntent = new Intent(getActivity(), Main_4_1_1.class);
//                startActivity(myIntent);
//            }
//        };

        mFab.setOnClickListener(fab_onClick);

        return view;
    }

    private final View.OnClickListener fab_onClick = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Intent myIntent = new Intent(getActivity(), Main_4_1_1.class);
            startActivity(myIntent);//启动
        }
    };

}
