package com.example.android.eatsydney;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.List;


public class BreakfastFragment extends Fragment {

    public BreakfastFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {


        View view = inflater.inflate(R.layout.place_list, container, false);


        //Create a ArrayList of Item
        final ArrayList<Item> items = new ArrayList<Item>();

        //Add list data


        items.add(new Item(getString(R.string.breakfast_one),
                R.drawable.rsz_bfast,
                getString(R.string.breakfast_one_address),
                (getString(R.string.breakfast_one_rating))));

        items.add(new Item(getString(R.string.breakfast_two),
                R.drawable.rsz_bfast_two,
                getString(R.string.breakfast_two_address),
                (getString(R.string.breakfast_two_rating))));

        items.add(new Item(getString(R.string.breakfast_three),
                R.drawable.rsz_bfast_three,
                getString(R.string.breakfast_three_address),
                (getString(R.string.breakfast_three_rating))));

        //Create an ItemAdapter
        final ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) view.findViewById(R.id.listview);

        //Bind with adapter
        listView.setAdapter(adapter);


        //Return the view
        return view;
    }

}