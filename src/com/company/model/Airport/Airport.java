package com.company.model.Airport;

import com.company.model.CRUDobj;

public class Airport extends CRUDobj {
    private int id;
    private int servicingCost;
    private String coordinates;
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getcCordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getServicingCost() {
        return servicingCost;
    }


    public void setServicingCost(int servicingCost) {
        this.servicingCost = servicingCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "id: " + this.getId()+ " coord: " +  this.getcCordinates() + " ServiceCosts: "
                +  this.getServicingCost() + " country:  " + this.getCountry();
    }
}
