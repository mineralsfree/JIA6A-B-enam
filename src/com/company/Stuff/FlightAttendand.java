package com.company.Stuff;

import java.util.Set;

public class FlightAttendand extends Stuff{
    private int Weight;
    private Set<String> SpokenLanguages;


    public Set<String> getSpokenLanguages() {
        return SpokenLanguages;
    }

    public void setSpokenLanguages(Set<String> spokenLanguages) {
        SpokenLanguages = spokenLanguages;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
}
