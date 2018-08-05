package com.example.android.tourguide.data;


import android.os.Parcel;
import android.os.Parcelable;

public class Location implements Parcelable {
    private String placeName;
    private int placeImage;
    private String description;
    private String url;


    private Location() {
    }

    public Location(String name, int id, String urlAsString) {
        placeImage = id;
        placeName = name;
        url = urlAsString;
    }

    public Location(String name, int id, String urlAsString, String description) {
        this(name, id, urlAsString);
        this.description = description;
    }

    public Location(Parcel in) {
        this.placeName = in.readString();
        this.placeImage = in.readInt();
        this.url = in.readString();
        this.description = in.readString();
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public String getUrl() {
        return url;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getDescription() {
        return description;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.placeName);
        dest.writeInt(this.placeImage);
        dest.writeString(this.url);
        dest.writeString(this.description);

    }
}
