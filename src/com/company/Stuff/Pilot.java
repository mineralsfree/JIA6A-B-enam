package com.company.Stuff;

public class Pilot extends Stuff{
    private String rank;
    private long loggedHours;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public long getLoggedHours() {
        return loggedHours;
    }

    public void setLoggedHours(long loggedHours) {
        this.loggedHours = loggedHours;
    }
}
