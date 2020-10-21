package com.example.myhealthapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ProfileFragment extends Fragment {
    String[] values = new String[] {"My Profile",
                                    "My Data",
                                     "Messages",
                                      "Notifications"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        ListView profileListView = (ListView) rootView.findViewById(R.id.profile_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        profileListView.setAdapter(adapter);

        return rootView;
    }
}