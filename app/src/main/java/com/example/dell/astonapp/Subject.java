package com.example.dell.astonapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.astonapp.Adapter.SubjectAdapter;
import com.example.dell.astonapp.Model_classis.Subject_Model;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Subject extends Fragment {

    private RecyclerView recyclerView;
    private SubjectAdapter adapter;
    private List<Subject_Model> subject_modelList;

    public Subject() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.subject, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        subject_modelList = new ArrayList<>();
        adapter = new SubjectAdapter(getContext(), subject_modelList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareSubject();
        return view;
    }

    private void prepareSubject() {
        Subject_Model a = new Subject_Model("DBMS",10,12,10);
        subject_modelList.add(a);

        a = new Subject_Model("youtube",11,12,17);
        subject_modelList.add(a);

        adapter.notifyDataSetChanged();
    }

}
