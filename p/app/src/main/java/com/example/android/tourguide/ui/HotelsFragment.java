package com.example.android.tourguide.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.MyListener;
import com.example.android.tourguide.R;
import com.example.android.tourguide.adapter.LocationAdapter;
import com.example.android.tourguide.data.Location;
import com.example.android.tourguide.data.LocationAssests;

import java.util.List;


public class HotelsFragment extends Fragment implements LocationAdapter.LocationItemClickListener {

    RecyclerView list;
    LocationAdapter adapter;
    MyListener callBack;
    private List<String> description;
    List<Location> selected;

    public HotelsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tour_guide, container, false);
        list = v.findViewById(R.id.rv_locations);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        list.setLayoutManager(layoutManager);
        list.setHasFixedSize(true);
        int s = TourGuideActivity.LOCATION_ID;
        switch (s) {
            case 0:
                selected = LocationAssests.getAmsterdamHostelList(getContext());
                description = LocationAssests.getAmsterdamHostelsDescription(getContext());
                break;
            case 1:
                selected = LocationAssests.getBarcelonaHostelList(getContext());
                description = LocationAssests.getBarcelonaHostelDescription(getContext());
                break;
            case 2:
                selected = LocationAssests.getParisHostelList(getContext());
                description = LocationAssests.getParisHostelDescription(getContext());
                break;
        }
        adapter = new LocationAdapter(getActivity(), selected.size(), this, selected);
        list.setAdapter(adapter);
        list.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.tab1));
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callBack = (MyListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnImageClickListener");
        }
    }

    @Override
    public void itemClicked(int index) {
        Location l = selected.get(index);
        callBack.clicked(l.getPlaceImage(), description.get(index), l.getUrl());

    }
}
