package com.example.android.eatsydney;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LunchFragment extends Fragment {


    public LunchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_list, container, false);

        //Create a ArrayList of Item
        final ArrayList<Item> items = new ArrayList<Item>();

        //Add list data


        items.add(new Item(getString(R.string.lunch_one),
                R.drawable.rsz_lunch_one,
                getString(R.string.lunch_one_address),
                (getString(R.string.lunch_one_rating))));

        items.add(new Item(getString(R.string.lunch_two),
                R.drawable.rsz_lunch_two,
                getString(R.string.lunch_two_address),
                (getString(R.string.lunch_two_rating))));

        items.add(new Item(getString(R.string.lunch_three),
                R.drawable.rsz_lunch_three,
                getString(R.string.lunch_three_address),
                (getString(R.string.lunch_three_rating))));

        //Create an ItemAdapter
        final ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) view.findViewById(R.id.listview);

        //Bind with adapter
        listView.setAdapter(adapter);



        return view;


    }
}
