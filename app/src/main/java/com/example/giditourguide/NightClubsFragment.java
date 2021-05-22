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
public class NightClubsFragment extends Fragment {

    public NightClubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an array of words
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.quilox), getString(R.string.ozumba_mbadiwe), getString(R.string.time_club_one),
                getString(R.string.phone_club_one), getString(R.string.site_club_one), R.drawable.quilox));
        places.add(new Place(getString(R.string.fifty_seven), getString(R.string.awolowo), getString(R.string.time_club_two), getString(R.string.phone_club_two),
                getString(R.string.site_club_two), R.drawable.club_57));
        places.add(new Place(getString(R.string.dna), getString(R.string.adetokunbo),
                getString(R.string.time_club_three), getString(R.string.phone_club_three), getString(R.string.site_club_three), R.drawable.club_dna));
        places.add(new Place(getString(R.string.cubana), getString(R.string.adeola),
                getString(R.string.time_club_four), getString(R.string.phone_club_four), getString(R.string.site_club_four), R.drawable.cubana_pablo));
        places.add(new Place(getString(R.string.skyfall), getString(R.string.elugishi_royal), getString(R.string.time_club_five),
                getString(R.string.phone_club_five), getString(R.string.site_club_five), R.drawable.skyfall));
        places.add(new Place(getString(R.string.moist), getString(R.string.oniru), getString(R.string.time_club_six),
                getString(R.string.phone_club_six), getString(R.string.site_club_six), R.drawable.moist_beach_club));
        places.add(new Place(getString(R.string.floating), getString(R.string.adedeji), getString(R.string.time_club_seven),
                getString(R.string.phone_club_seven), getString(R.string.site_club_seven), R.drawable.floating_world));
        places.add(new Place(getString(R.string.lounge), getString(R.string.bode), getString(R.string.time_club_eight),
                getString(R.string.phone_club_eight), getString(R.string.site_club_eight), R.drawable.lounge_38));
        places.add(new Place(getString(R.string.montana), getString(R.string.isaac), getString(R.string.time_club_nine),
                getString(R.string.phone_club_nine), getString(R.string.site_club_nnine), R.drawable.cubana_montana));
        places.add(new Place(getString(R.string.escape), getString(R.string.odeku), getString(R.string.time_club_ten),
                getString(R.string.phone_club_ten), getString(R.string.site_club_ten), R.drawable.escape));

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