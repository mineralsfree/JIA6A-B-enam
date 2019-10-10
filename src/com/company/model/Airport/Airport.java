package com.company.model.Airport;

import com.company.model.CRUDobj;

public class Airport extends CRUDobj implements Comparable<Airport> {
    private int id;
    private int servicingCost;
    private String coordinates;
    private String country;

    public Airport(int id, int servicingCost, String coordinates, String country) {
       this.id = id;
       this.servicingCost = servicingCost;
       this.coordinates = coordinates;
       this.country = country;
    }
    
    public Airport() {
    }
    
    public String getCountry() {
        return country;
    }

    public Airport setCountry(String country) {
        this.country = country;
    }

    public String getcCordinates() {
        return coordinates;
    }

    public Airport setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getServicingCost() {
        return servicingCost;
    }


    public Airport setServicingCost(int servicingCost) {
        this.servicingCost = servicingCost;
    }

    public int getId() {
        return id;
    }

    public Airport setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "id: " + this.getId()+ " coord: " +  this.getcCordinates() + " ServiceCosts: "
                +  this.getServicingCost() + " country:  " + this.getCountry();
    }
    
    @Override
    public int compareTo(final Airport port) {
        return this.country.compareTo(port.country);
    }
}
