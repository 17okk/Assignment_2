package com.csc340.demo;

public class Esports {
    public String name;
    public String team;
    public double rating;

    public Esports(String name, String team, double rating) {
        this.name = name;
        this.team = team;
        this.rating = rating;
    }

    public String getName() { return name;}
    public void setName(String name) { this.name = name;}

    public String getTeam() { return team;}
    public void setTeam(String team) { this.team = team;}

    public double getRating() { return rating;}
    public void setRating(double rating) { this.rating = rating;}
}
