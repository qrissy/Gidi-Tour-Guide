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
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an array of words
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.craftmanship), getString(R.string.dopemu),
                getString(R.string.time_event_one), getString(R.string.date_event_one), R.drawable.craftmanship));
        places.add(new Place(getString(R.string.goalfest), getString(R.string.balmoral),
                getString(R.string.time_event_two), getString(R.string.date_event_two), R.drawable.goalfest));
        places.add(new Place(getString(R.string.unusual), getString(R.string.isiola),
                getString(R.string.time_event_three), getString(R.string.date_event_three), R.drawable.unusual_suspect));
        places.add(new Place(getString(R.string.mec), getString(R.string.lanre),
                getString(R.string.time_event_four), getString(R.string.date_event_four), R.drawable.mec_trade_fair));
        places.add(new Place(getString(R.string.digital), getString(R.string.polystar), getString(R.string.time_event_five),
                getString(R.string.date_event_five), R.drawable.digital_nomads));
        places.add(new Place(getString(R.string.not), getString(R.string.herbert), getString(R.string.time_event_six), getString(R.string.date_event_six),
                R.drawable.not_so_pop_up));
        places.add(new Place(getString(R.string.yoga), getString(R.string.elegushi), getString(R.string.time_event_seven), getString(R.string.date_event_seven),
                R.drawable.yoga_by_the_beach));
        places.add(new Place(getString(R.string.soundman), getString(R.string.idewu), getString(R.string.time_event_eight), getString(R.string.date_event_eight),
                R.drawable.the_soundman));
        places.add(new Place(getString(R.string.jingle), getString(R.string.agidingni), getString(R.string.time_event_nine), getString(R.string.date_event_nine),
                R.drawable.jingle_and_mingle));

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
                Intent intent = new Intent(getActivity(), EventDetailActivity.class);
                intent.putExtra("place_name", place.getNameOfPlace());
                intent.putExtra("place_address", place.getAddress());
                intent.putExtra("business_hour", place.getBusinessHours());
                intent.putExtra("event_date", place.getDate());
                intent.putExtra("place_image", place.getImageResourceId());
                startActivity(intent);
            }
        });

        return rootView;
    }
}