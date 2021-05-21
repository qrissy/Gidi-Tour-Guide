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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an array of words
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.radisson), getString(R.string.mbadiwe), getString(R.string.time_hotel_one),
                getString(R.string.phone_hotel_one), getString(R.string.site_hotel_one), R.drawable.radisson_blu));
        places.add(new Place(getString(R.string.continental), getString(R.string.kofo), getString(R.string.time_hotel_two),
                getString(R.string.phone_hotel_two), getString(R.string.site_hotel_two), R.drawable.lagos_continental));
        places.add(new Place(getString(R.string.southern), getString(R.string.alfred), getString(R.string.time_hotel_three),
                getString(R.string.phone_hotel_three), getString(R.string.site_hotel_three), R.drawable.southern_sun));
        places.add(new Place(getString(R.string.eko), getString(R.string.ademola), getString(R.string.time_hotel_four),
                getString(R.string.phone_hotel_four), getString(R.string.site_hotel_four), R.drawable.eko_hotel));
        places.add(new Place(getString(R.string.legend), getString(R.string.murtala), getString(R.string.time_hotel_five),
                getString(R.string.phone_hotel_five), getString(R.string.site_hotel_five), R.drawable.legend_hotel));
        places.add(new Place(getString(R.string.george), getString(R.string.lugard), getString(R.string.time_hotel_six), getString(R.string.phonr_hotel_six),
                getString(R.string.site_hotel_six), R.drawable.the_george));
        places.add(new Place(getString(R.string.ibis), getString(R.string.toyin), getString(R.string.time_hotel_seven), getString(R.string.phone_hotel_seven),
                getString(R.string.site_hotel_seven), R.drawable.ibis_hotel));
        places.add(new Place(getString(R.string.seattle), getString(R.string.walter), getString(R.string.time_hotel_eight),
                getString(R.string.phone_hotel_eight), getString(R.string.site_hotel_eight), R.drawable.seattle_residence));
        places.add(new Place(getString(R.string.wheatbaker), getString(R.string.lawrence), getString(R.string.time_nine), getString(R.string.phone_hotel_nine),
                getString(R.string.site_hotel_nine), R.drawable.the_wheatbaker));
        places.add(new Place(getString(R.string.sheraton), getString(R.string.mobolaji), getString(R.string.time_hotel_ten), getString(R.string.phone_hotel_ten),
                getString(R.string.site_hotel_ten),
                R.drawable.sheraton));

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