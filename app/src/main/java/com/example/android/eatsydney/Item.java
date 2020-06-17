package com.example.android.eatsydney;


//Create Item class
public class Item {
    //Initialise variables
    private String itemTitle;
    private int itemImageResourceId;
    private String itemLocation;
    private String itemReview;

    //Item constructor takes 4 params
    public Item(String title, int imageResourceId, String location, String review) {
        itemTitle = title;
        itemImageResourceId = imageResourceId;
        itemLocation = location;
        itemReview = review;
    }




    //Return Title
    public String getTitle() {
        return itemTitle;
    }

    //Return ImageResource
    public int getImageResourceId() {
        return itemImageResourceId;
    }

    //Return Location
    public String getLocation() {
        return itemLocation;
    }

    //Return ReviewStars
    public String getReview() {
        return itemReview;
    }

}
