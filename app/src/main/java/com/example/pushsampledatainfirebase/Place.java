package com.example.pushsampledatainfirebase;

public class Place {
    public String name;
    public String urlMap;
    public String workingHours;
    public String placePhoneNumber;
    public String imgPath;
    public int distance;
    public boolean isFavourite;
    public boolean isVisited;
    public String userEmail;
    public Object nto100;
    public Place(String name, String urlMap, String workingHours, String placePhoneNumber, String imgPath, int distance, boolean isFavourite, boolean isVisited, String userEmail, Object nto100){
        this.name = name;
        this.urlMap = urlMap;
        this.workingHours = workingHours;
        this.placePhoneNumber = placePhoneNumber;
        this.imgPath = imgPath;
        this.distance = distance;
        this.isFavourite = isFavourite;
        this.isVisited = isVisited;
        this.userEmail = userEmail;
        this.nto100 = nto100;
    }
}
