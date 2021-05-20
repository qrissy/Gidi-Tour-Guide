package com.example.giditourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        places.add(new Place("Shiro Restaurant & Bar", "Block XVI 3 & 4 Victoria Island Oniru Estate, Eti-Osa 101241, Lagos",
                "12:00 PM - 11:30 PM", "0818 629 8888", "https://shiro-pan-asian-restaurant.business.site/", R.drawable.shiro));
        places.add(new Place("Hard Rock Cafe", "Landmark Village, Water Corporation Road, Oniru, VI, 550104, Lagos",
                "12:00 PM - 11:30 PM", "0908 198 8888", "https://www.hardrockcafe.com/location/lagos",
                R.drawable.hard_rock_cafe));
        places.add(new Place("RSVP Lagos", "9 Eletu Ogabi St, Victoria Island 101001, Lagos", "11:00 AM - 11:00 PM",
                "0818 616 6666", "https://rsvplagos.com/", R.drawable.rsvp));
        places.add(new Place("Ocean Basket", "35 Akin Adesola St, Victoria Island, Lagos", "10:30 AM - 10:30 PM",
                "0816 059 1821", "https://www.nigeria.oceanbasket.com/", R.drawable.ocean_basket));
        places.add(new Place("Cactus Restaurant", "20/24 Ozumba Mbadiwe Rd, Victoria Island, Lagos", "7:30 AM - 10:00 PM",
                "0802 777 7666", "https://web.facebook.com/CactusBakery", R.drawable.cactus));
        places.add(new Place("Noir Lagos", "4a Akin Olugbade St, Victoria Island, Lagos", "12:00 PM - 11:00 PM",
                "0908 066 6687", "http://www.noir.live/", R.drawable.noir));
        places.add(new Place("Craft Gourmet", "14 Idowu Martins St, Victoria Island, Lagos", "8:00 AM - 10:00 PM",
                "0909 777 7752", "linktr.ee/craftlagos", R.drawable.craft_gourmet));
        places.add(new Place("The Yellow Chilli Restaurant & Bar", "27, Oju Olobun Close, Off Bishop Oluwole Street, Victoria Island, Lagos",
                "11AM - 11PM", "08099623614", "http://yellowchilling.com/", R.drawable.the_yellow_chilli));
        places.add(new Place("Bungalow Restaurant", "1296 Akin Adesola St, Victoria Island, Lagos", "10:30AM - 11:30PM",
                "0803 304 9104", "https://www.bungalowrestaurant.com/", R.drawable.bungalow));
        places.add(new Place("Izanagi", "19B Idejo St, Victoria Island 101241, Lagos", "12:00 PM - 10:30 PM",
                "0706 222 2222", "http://izanagirestaurant.com/", R.drawable.izanagi));

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

        return rootView;
    }
}