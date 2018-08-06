package com.example.android.tourguide.data;

import android.content.Context;

import com.example.android.tourguide.R;

import java.util.ArrayList;
import java.util.List;


public final class LocationAssests {

    public static List<String> getAmsterdamFoodDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.afd_1));
            add(c.getString(R.string.afd_2));
            add(c.getString(R.string.afd_3));
            add(c.getString(R.string.afd_4));

        }};
    }

    public static List<Location> getParisHotelList(final Context c) {
        return new ArrayList<Location>() {
            {
                add(new Location(c.getString(R.string.p_hot_1), R.drawable.paris_food_1, c.getString(R.string.p_hoq_1)));
                add(new Location(c.getString(R.string.p_hot_2), R.drawable.paris_food_2, c.getString(R.string.p_hoq_2)));
                add(new Location(c.getString(R.string.p_hot_3), R.drawable.paris_food_3, c.getString(R.string.p_hoq_3)));
                add(new Location(c.getString(R.string.p_hot_4), R.drawable.paris_food_4, c.getString(R.string.p_hoq_4)));

            }
        };
    }

    public static List<Location> getParisPlacesList(final Context c) {
        return new ArrayList<Location>() {{
            add(new Location(c.getString(R.string.p_pl_1), R.drawable.paris_place_1, c.getString(R.string.p_plq_1)));
            add(new Location(c.getString(R.string.p_pl_2), R.drawable.paris_place_2, c.getString(R.string.p_plq_2)));
            add(new Location(c.getString(R.string.p_pl_3), R.drawable.paris_place_3, c.getString(R.string.p_plq_3)));

        }};
    }

    public static List<Location> getBarcelonaHostelList(final Context c) {
        return new ArrayList<Location>() {
            {
                add(new Location(c.getString(R.string.b_hos_1), R.drawable.barcelona_hostel_1, c.getString(R.string.b_hosq_1)));
                add(new Location(c.getString(R.string.b_hos_2), R.drawable.barcelona_hostel_2, c.getString(R.string.b_hosq_2)));
                add(new Location(c.getString(R.string.b_hos_3), R.drawable.barcelona_hostel_3, c.getString(R.string.b_hosq_3)));
                add(new Location(c.getString(R.string.b_hos_4), R.drawable.barcelona_hostel_4, c.getString(R.string.b_hosq_4)));
            }
        };
    }

    public static List<Location> getParisHostelList(final Context c) {
        return new ArrayList<Location>() {
            {
                add(new Location(c.getString(R.string.p_hos_1), R.drawable.paris_hostel_1, c.getString(R.string.p_hosq_1)));
                add(new Location(c.getString(R.string.p_hos_2), R.drawable.paris_hostel_2, c.getString(R.string.p_hosq_2)));
                add(new Location(c.getString(R.string.p_hos_3), R.drawable.paris_hostel_3, c.getString(R.string.p_hosq_3)));
            }
        };
    }

    public static List<String> getAmsterdamGeneralDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.agd1));
            add(c.getString(R.string.agd2));
            add(c.getString(R.string.agd3));
        }};
    }

    public static List<String> getBarcelonaGeneralDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.bgd1));
            add(c.getString(R.string.bgd2));
            add(c.getString(R.string.bgd3));

        }};
    }

    public static List<String> getParisGeneralDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.pgd1));
            add(c.getString(R.string.pgd2));
            add(c.getString(R.string.pgd3));
        }};
    }

    public static List<String> getBarcelonaFoodDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.bfd1));
            add(c.getString(R.string.bfd2));
            add(c.getString(R.string.bfd3));
        }};
    }

    public static List<String> getParisFoodDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.pfd1));

            add(c.getString(R.string.pfd2));
            add(c.getString(R.string.pfd3));
            add(c.getString(R.string.pfd4));
        }};
    }

    public static List<String> getAmsterdamPlacesDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.apld1));
            add(c.getString(R.string.apld2));
            add(c.getString(R.string.apld3));
            add(c.getString(R.string.apld4));
        }};
    }

    public static List<String> getBarcelonaPlacesDescription(final Context c) {
        return new ArrayList<String>() {
            {
                add(c.getString(R.string.bpld1));
                add(c.getString(R.string.bpld2));
                add(c.getString(R.string.bpld3));
                add(c.getString(R.string.bpld4));
            }
        };
    }

    public static List<String> getParisPlacesDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.parpd1));
            add(c.getString(R.string.parpd2));
            add(c.getString(R.string.parpd3));
        }};
    }

    public static List<String> getAmsterdamHostelsDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.ahostd1));
            add(c.getString(R.string.ahostd2));
            add(c.getString(R.string.ahostd3));
            add(c.getString(R.string.ahostd4));

        }};
    }

    public static List<String> getBarcelonaHostelDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.bhostd1));
            add(c.getString(R.string.bhostd2));
            add(c.getString(R.string.bhostd3));
            add(c.getString(R.string.bhostd4));


        }};
    }

    public static List<String> getParisHostelDescription(final Context c) {
        return new ArrayList<String>() {{
            add(c.getString(R.string.pard_hos1));
            add(c.getString(R.string.pard_hos2));
            add(c.getString(R.string.pard_hos3));
        }};

    }


    public static List<Location> getParisGeneral(final Context c) {
        return new ArrayList<Location>() {{
            add(new Location(c.getString(R.string.climate), R.drawable.paris_climate, c.getString(R.string.paris_q)));
            add(new Location(c.getString(R.string.fashion), R.drawable.paris_fashion, c.getString(R.string.paris_q)));
            add(new Location(c.getString(R.string.culture), R.drawable.paris_culture, c.getString(R.string.paris_q)));
        }};
    }


    public static List<Location> getBarcelonaPlacesList(final Context c) {
        return new ArrayList<Location>() {{
            add(new Location(c.getString(R.string.bplce1), R.drawable.barcelona_place_1, c.getString(R.string.bplq1)));
            add(new Location(c.getString(R.string.bplce2), R.drawable.barcelona_place_2, c.getString(R.string.bplq2)));
            add(new Location(c.getString(R.string.bplce3), R.drawable.barcelona_place_3, c.getString(R.string.bplq3)));
            add(new Location(c.getString(R.string.bplce4), R.drawable.barcelona_place_4, c.getString(R.string.bplq4)));

        }};
    }

    public static List<Location> getBarcelonaHotelList(final Context c) {
        return new ArrayList<Location>() {
            {
                add(new Location(c.getString(R.string.barc_hotel_1), R.drawable.barcelona_food_1, c.getString(R.string.bqhotel_1)));
                add(new Location(c.getString(R.string.barc_hotel_2), R.drawable.barcelona_food_2, c.getString(R.string.bqhotel_2)));
                add(new Location(c.getString(R.string.barc_hotel_3), R.drawable.barcelona_food_3, c.getString(R.string.bqhotel_3)));

            }
        };
    }

    public static List<Location> getBarcelonaGeneral(final Context c) {
        return new ArrayList<Location>() {{
            add(new Location(c.getString(R.string.climate), R.drawable.barcelona_climate, c.getString(R.string.barc_q)));
            add(new Location(c.getString(R.string.fashion), R.drawable.barcelona_fashion, c.getString(R.string.barc_q)));
            add(new Location(c.getString(R.string.culture), R.drawable.barcelona_culture, c.getString(R.string.barc_q)));
        }};
    }


    public static List<Location> getLocation(final Context c) {
        return new ArrayList<Location>() {{
            add(new Location(c.getString(R.string.amsterdam), R.drawable.amsterdam, c.getString(R.string.amst_query)));
            add(new Location(c.getString(R.string.barcelona), R.drawable.barcelona, c.getString(R.string.barc_q)));
            add(new Location(c.getString(R.string.paris), R.drawable.paris, c.getString(R.string.paris_q)));

        }};
    }

    public static List<Location> getAmsterdamGeneral(final Context c) {
        return new ArrayList<Location>() {
            {
                add(new Location(c.getString(R.string.climate), R.drawable.amsterdam_weather, c.getString(R.string.amst_query)));
                add(new Location(c.getString(R.string.fashion), R.drawable.amsterdam_fashion, c.getString(R.string.amst_query)));
                add(new Location(c.getString(R.string.culture), R.drawable.amsterdam_culture, c.getString(R.string.amst_query)));

            }
        };
    }

    public static List<Location> getAmsterdamHotelList(final Context c) {
        return new ArrayList<Location>() {{
            add(new Location(c.getString(R.string.amst_hotel_1), R.drawable.amsterdam_food_1, c.getString(R.string.amst_hotel_1_q)));
            add(new Location(c.getString(R.string.amst_hotel_2), R.drawable.amsterdam_food_2, c.getString(R.string.amst_hotel_2_q)));
            add(new Location(c.getString(R.string.amst_hotel_3), R.drawable.amsterdam_food_3, c.getString(R.string.amst_hotel_3_q)));
            add(new Location(c.getString(R.string.amst_hotel_4), R.drawable.amsterdam_food_4, c.getString(R.string.amst_hotel_4_q)));
        }};
    }

    public static List<Location> getAmsterdamPlacesList(final Context c) {
        return new ArrayList<Location>() {
            {
                add(new Location(c.getString(R.string.amsterdam_place_1), R.drawable.amsterdam_place_1, c.getString(R.string.amst_place_1_q)));
                add(new Location(c.getString(R.string.amsterdam_place_2), R.drawable.amsterdam_place_2, c.getString(R.string.amst_place_2_q)));
                add(new Location(c.getString(R.string.amsterdam_place_3), R.drawable.amsterdam_place_3, c.getString(R.string.amst_place_3_q)));
                add(new Location(c.getString(R.string.amsterdam_place_4), R.drawable.amsterdam_place_4, c.getString(R.string.amst_place_4_q)));

            }
        };
    }

    public static List<Location> getAmsterdamHostelList(final Context c) {
        return new ArrayList<Location>() {
            {
                add(new Location(c.getString(R.string.amsterdam_hostel_1), R.drawable.amsterdam_hostel_1, c.getString(R.string.amst_hostel_1_q)));
                add(new Location(c.getString(R.string.amsterdam_hostel_2), R.drawable.amsterdam_hostel_2, c.getString(R.string.amst_hostel_2_q)));
                add(new Location(c.getString(R.string.amsterdam_hostel_3), R.drawable.amsterdam_hostel_3, c.getString(R.string.amst_hostel_3_q)));
                add(new Location(c.getString(R.string.amsterdam_hostel_4), R.drawable.amsterdam_hostel_4, c.getString(R.string.amst_hostel_1_q)));
            }
        };
    }


}
