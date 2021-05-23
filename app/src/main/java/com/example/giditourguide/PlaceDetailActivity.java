package com.example.giditourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        // Place image view
        ImageView placeImage = findViewById(R.id.place_image);
        placeImage.setImageResource(getIntent().getIntExtra(getString(R.string.image_of_place), 0));

        // Place name view
        TextView placeName = findViewById(R.id.place_name);
        placeName.setText(getIntent().getStringExtra(getString(R.string.place_name)));

        // Place address view
        TextView placeAddress = findViewById(R.id.place_address);
        placeAddress.setText(getIntent().getStringExtra(getString(R.string.place_address)));

        // Set a click listener to show the map of the place when the list item is clicked on
        placeAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMap(placeAddress.getText().toString());
                placeAddress.setTextColor(Color.RED);
            }
        });

        // Place business hour view
        TextView businessHours = findViewById(R.id.business_hours);
        businessHours.setText(getIntent().getStringExtra(getString(R.string.business_hour)));

        // Place phone view
        TextView phoneNumber = findViewById(R.id.phone_number);
        phoneNumber.setText(getIntent().getStringExtra(getString(R.string.place_phone)));

        // Place website view
        TextView website = findViewById(R.id.web);
        website.setText(getIntent().getStringExtra(getString(R.string.place_website)));
    }

    /**
     * Create an intent that is used to show the map
     *
     * @param address of the place
     */
    public void showMap(String address) {
        Uri uri = Uri.parse(getFormattedString(address));
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * It format string of the address
     *
     * @param address of the place
     * @return the geolocation
     */
    private String getFormattedString(String address) {
        return "geo:0,0?q=" + address.replace(" ", "+");
    }
}