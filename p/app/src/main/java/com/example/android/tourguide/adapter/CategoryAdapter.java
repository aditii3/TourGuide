package com.example.android.tourguide.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguide.R;
import com.example.android.tourguide.ui.AttractionsFragment;
import com.example.android.tourguide.ui.FoodFragment;
import com.example.android.tourguide.ui.GeneralFragment;
import com.example.android.tourguide.ui.HotelsFragment;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context c;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        c = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new GeneralFragment();
        } else {
            return new HotelsFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return c.getString(R.string.places_tab);
        } else if (position == 1) {
            return c.getString(R.string.food_tab);
        } else if (position == 2) {
            return c.getString(R.string.general_tab);
        } else {
            return c.getString(R.string.hostel_tab);
        }
    }
}
