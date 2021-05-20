package com.example.giditourguide;

import androidx.annotation.NonNull;

/**
 * {@link Place} represent a destination that the user may
 * want to visit.
 */
public class Place {

    /** The name of the place */
    private String mNameOfPlace;

    /** The address of the place */
    private String mAddress;

    /** The time the place is open for business */
    private String mBusinessHours;

    /** The phone number of the place */
    private String mPhoneNumber;

    /** The website of the place */
    private String mWebsite;

    /** Date of the event */
    private String mDate;

    /** Image resource ID of the place */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param nameOfPlace is a potential place of the user might visit
     *
     * @param address address of a likely place to visit
     *
     * @param businessHours the time business start and end
     *
     * @param imageResourceId is the drawable Resource ID for the image associated with the place
     */
    public Place(String nameOfPlace, String address, String businessHours, String date, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mAddress = address;
        mBusinessHours = businessHours;
        mDate = date;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Place object.
     *
     * @param nameOfPlace is a potential place of the user might visit
     *
     * @param address address of a likely place to visit
     *
     * @param businessHours the time business start and end
     *
     * @param phoneNumber the contact number of the place
     *
     * @param website is where the place can be found online
     *
     * @param imageResourceId is the drawable Resource ID for the image associated with the place
     */
    public Place(String nameOfPlace, String address, String businessHours, String phoneNumber,
                 String website, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mAddress = address;
        mBusinessHours = businessHours;
        mPhoneNumber = phoneNumber;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getNameOfPlace() {
        return mNameOfPlace;
    }

    /**
     * Get the address of the place.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the opening hours of the place.
     */
    public String getBusinessHours() {
        return mBusinessHours;
    }

    /**
     * Get the phone number of the place.
     */
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    /**
     * Get the website of the place.
     */
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Get the date of the event
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
