package com.example.android.tourguide.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapter.LocationAdapter;
import com.example.android.tourguide.data.Location;
import com.example.android.tourguide.data.LocationAssests;

import java.util.List;


public class TourGuideFragment extends Fragment implements LocationAdapter.LocationItemClickListener {
    RecyclerView locationList;
    LocationAdapter adapter;
    private listener callBack;

    public interface listener {
        void clicked(int i);
    }

    public TourGuideFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callBack = (listener) context;
        } catch (ClassCastException e) {
            return;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tour_guide, container, false);
        locationList = rootView.findViewById(R.id.rv_locations);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        locationList.setLayoutManager(layoutManager);
        locationList.setHasFixedSize(true);
        List<Location> l = LocationAssests.getLocation(getContext());
        adapter = new LocationAdapter(getContext(), l.size(), this, l);
        locationList.setAdapter(adapter);
        return rootView;

    }

    @Override
    public void itemClicked(int index) {
        callBack.clicked(index);

    }
}
