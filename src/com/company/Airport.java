package com.company;

public class Airport {
    private int ServicingCost;
    private String Coordinates;
    private String Country;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCoordinates() {
        return Coordinates;
    }

    public void setCoordinates(String coordinates) {
        Coordinates = coordinates;
    }

    public int getServicingCost() {
        return ServicingCost;
    }

    public void setServicingCost(int servicingCost) {
        ServicingCost = servicingCost;
    }
}
