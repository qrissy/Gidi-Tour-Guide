package com.example.giditourguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an array of words
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.shiro), getString(R.string.victoria_island),
                getString(R.string.time_restaurant_one), getString(R.string.phone_restaurant_one), getString(R.string.site_restaurant_one), R.drawable.shiro));
        places.add(new Place(getString(R.string.hard_rock), getString(R.string.landmark),
                getString(R.string.time_restaurant_two), getString(R.string.phone_restaurant_two), getString(R.string.site_restaurant_two),
                R.drawable.hard_rock_cafe));
        places.add(new Place(getString(R.string.rsvp), getString(R.string.eletu), getString(R.string.time_restaurant_three),
                getString(R.string.phone_restaurant_three), getString(R.string.site_restaurant_three), R.drawable.rsvp));
        places.add(new Place(getString(R.string.ocean), getString(R.string.akin), getString(R.string.time_restaurant_four),
                getString(R.string.phone_restaurant_four), getString(R.string.site_restaurant_four), R.drawable.ocean_basket));
        places.add(new Place(getString(R.string.cactus), getString(R.string.ozumba), getString(R.string.time_restaurant_five),
                getString(R.string.phone_restaurant_five), getString(R.string.site_restaurant_five), R.drawable.cactus));
        places.add(new Place(getString(R.string.noir), getString(R.string.akin_olugbade), getString(R.string.time_restaurant_six),
                getString(R.string.phone_restaurant_six), getString(R.string.site_restaurant_six), R.drawable.noir));
        places.add(new Place(getString(R.string.craft), getString(R.string.martins), getString(R.string.time_restaurant_seven),
                getString(R.string.phone_restaurant_seven), getString(R.string.site_restaurant_seven), R.drawable.craft_gourmet));
        places.add(new Place(getString(R.string.yellow), getString(R.string.oju),
                getString(R.string.time_restaurant_eight), getString(R.string.phone_restaurant_eight), getString(R.string.site_restaurant_eight), R.drawable.the_yellow_chilli));
        places.add(new Place(getString(R.string.bungalow), getString(R.string.adesola), getString(R.string.time_restaurant_nine),
                getString(R.string.phone_restaurant_nine), getString(R.string.site_restaurant_nine), R.drawable.bungalow));
        places.add(new Place(getString(R.string.izanagi), getString(R.string.idejo), getString(R.string.time_restaurant_ten),
                getString(R.string.phone_restaurant_ten), getString(R.string.site_restaurant_ten), R.drawable.izanagi));

        // Create a {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Place place = places.get(i);
                Intent intent = new Intent(getActivity(), PlaceDetailActivity.class);
                intent.putExtra("place_name", place.getNameOfPlace());
                intent.putExtra("place_address", place.getAddress());
                intent.putExtra("business_hour", place.getBusinessHours());
                intent.putExtra("place_phone", place.getPhoneNumber());
                intent.putExtra("website", place.getWebsite());
                intent.putExtra("place_image", place.getImageResourceId());
                startActivity(intent);
            }
        });

        return rootView;
    }
}