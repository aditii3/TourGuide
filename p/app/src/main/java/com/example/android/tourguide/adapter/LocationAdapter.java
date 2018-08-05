package com.example.android.tourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.data.Location;

import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {
    private int numItems;
    private Context context;
    private List<Location> locationList;
    final private LocationItemClickListener listener;

    public interface LocationItemClickListener {
        void itemClicked(int index);
    }

    public LocationAdapter(Context c, int numberOfItems, LocationItemClickListener l, List<Location> list) {
        context = c;
        numItems = numberOfItems;
        listener = l;
        locationList = list;

    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.v("LocationAdapter", "Crreating");
        Context c = parent.getContext();
        View v = LayoutInflater.from(c).inflate(R.layout.location_item, parent, false);
        LocationViewHolder holder = new LocationViewHolder(v);
        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return numItems;
    }

    class LocationViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView locationImage;
        TextView locationText;

        public LocationViewHolder(View itemView) {
            super(itemView);
            locationImage = itemView.findViewById(R.id.location_img);
            locationText = itemView.findViewById(R.id.location_text);
            itemView.setOnClickListener(this);

        }

        void bind(int listIndex) {

            locationImage.setImageResource(locationList.get(listIndex).getPlaceImage());
            locationText.setText(locationList.get(listIndex).getPlaceName());

        }

        @Override
        public void onClick(View v) {
            listener.itemClicked(getAdapterPosition());
        }
    }

}
