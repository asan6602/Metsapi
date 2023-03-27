package com.example.aaronsantos.Mets.api.model;

public class player {
    private int id;
    private int number;
    private String name;
    private String bats;
    private String hand;
    private int birthYear;
    private int debutYear;
    private int retireYear;
    private String position;
    private int height;
    private int weight;
    private int allStars;
    

    public player(int id, int number, String name, String bats, String hand, int birthYear, int debutYear, int retireYear, String position, int height, int weight, int allStars) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.bats = bats;
        this.hand = hand;
        this.birthYear = birthYear;
        this.debutYear = debutYear;
        this.retireYear = retireYear;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.allStars = allStars;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getPosition() {
        return position;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    
    public int getAllStars() {
        return allStars;
    }

    public int getRetireYear() {
        return retireYear;
    }
    public int getDebutYear() {
        return debutYear;
    }

    public int getNumber() {
        return number;
    }
    public String getBats() {
        return bats;
    }
    public String getHand() {
        return hand;
    }
}
