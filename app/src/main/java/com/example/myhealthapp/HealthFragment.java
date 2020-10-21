package com.example.myhealthapp;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class HealthFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_health, container, false);
        CardView heart_rate_CV = (CardView) rootView.findViewById(R.id.heart_rate_card);
        CardView activities_CV = (CardView) rootView.findViewById(R.id.activities_card);
        CardView sleep_CV = (CardView) rootView.findViewById(R.id.sleep_card);
        CardView history_CV = (CardView) rootView.findViewById(R.id.dailies_card);
        heart_rate_CV.setOnClickListener(this);
        activities_CV.setOnClickListener(this);
        sleep_CV.setOnClickListener(this);
        history_CV.setOnClickListener(this);
        return rootView;

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.heart_rate_card) {
            Log.i("My App", "Health app");
            Toast.makeText(getContext(),"Heart Rate Test",Toast.LENGTH_SHORT).show();//((), "Its magic", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.activities_card) {
            Log.i("My App", "Health app");
            Toast.makeText(getContext(),"Activities Test",Toast.LENGTH_SHORT).show();//((), "Its magic", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.sleep_card) {
            Log.i("My App", "Health app");
            Toast.makeText(getContext(),"Sleep Test",Toast.LENGTH_SHORT).show();//((), "Its magic", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.dailies_card) {
            Log.i("My App", "Health app");
            Toast.makeText(getContext(),"Dailies Test",Toast.LENGTH_SHORT).show();//((), "Its magic", Toast.LENGTH_SHORT).show();
        }
    }
}