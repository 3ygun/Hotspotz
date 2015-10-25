package com.example.hotspotz.category;

import com.example.hotspotz.interfaces.CategoryData;
import com.example.hotspotz.utility.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 10/24/2015.
 */
public class GraffitiData implements CategoryData {

    @Override
    public List<String> getPictures() {
        List<String> pictures = new ArrayList<String>();
        pictures.add("cat");
        return pictures;
    }

    @Override
    public List<Location> getLocations() {
        List<Location> locations = new ArrayList<Location>();
        locations.add(new Location(39.9987819, -83.01155389999997)); // The Oval (Lat: 39.9987819, Long: -83.01155389999997)
        return locations;
    }
}
