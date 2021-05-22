package com.example.giditourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        ImageView placeImage = findViewById(R.id.place_image);
        placeImage.setImageResource(getIntent().getIntExtra("place_image", 0));

        TextView placeName = findViewById(R.id.place_name);
        placeName.setText(getIntent().getStringExtra("place_name"));

        TextView placeAddress = findViewById(R.id.place_address);
        placeAddress.setText(getIntent().getStringExtra("place_address"));

        TextView businessHours = findViewById(R.id.business_hours);
        businessHours.setText(getIntent().getStringExtra("business_hour"));

        TextView phoneNumber = findViewById(R.id.phone_number);
        phoneNumber.setText(getIntent().getStringExtra("place_phone"));

        TextView website = findViewById(R.id.web);
        website.setText(getIntent().getStringExtra("website"));
    }
}