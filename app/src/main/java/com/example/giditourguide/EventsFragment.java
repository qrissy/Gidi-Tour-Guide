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
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Craftmanship Art Exhibition", "114 Dopemu Road, Lagos, LA",
                "12:00 PM", "May 21, 2021", R.drawable.craftmanship));
        places.add(new Place("GOALFEST 2021", "Balmoral Convention Centre, Federal Palace Hotel,, Victoria Island, Lagos 100001",
                "3:00 PM - 10:00 PM", "May 29, 2021", R.drawable.goalfest));
        places.add(new Place("Unusual Suspects", "3b Isiola Oyekan Close, Off Adeleke Adedoyin Street, Victoria Island, Lagos 23401",
                "4:00 PM – 10:00 PM", "May 23, 2021", R.drawable.unusual_suspect));
        places.add(new Place("MEC TRADE FAIR / HANGOUT", "Lanre Awolokun Street, Lagos, LA",
                "9:00 AM – 6:00 PM", "May 30, 2021", R.drawable.mec_trade_fair));
        places.add(new Place("Digital Nomad Roundtable", "Polystar Building, 4th floor, Second roundabout, Maruwa, Lekki, Lagos 234101", "3:30 PM – 7:00 PM",
                "May 27, 2021", R.drawable.digital_nomads));
        places.add(new Place("Not-so Pop-up", "183 Herbert Macaulay Way, Lagos, LA 100001", "12:00 PM – 7:00 PM", "May 22, 2021",
                R.drawable.not_so_pop_up));
        places.add(new Place("Yoga By The Beach", "Elegushi Royal Beach Lekki Lagos, By Road 3, Lekki, LA", "8:00 AM – 10:00 AM", "May 29, 2021",
                R.drawable.yoga_by_the_beach));
        places.add(new Place("The SoundMan Concert 2.0", "176 Idewu Street, Lagos, LA 102241", "6:00 PM - 2:00 AM", "Jun 5, 2021",
                R.drawable.the_soundman));
        places.add(new Place("Jingle and Mingle House Party", "Agidingbi, Ikeja, Lagos., Lagos, LA", "11:00 AM – 8:30 PM", "June 26, 2021",
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

        return rootView;
    }
}