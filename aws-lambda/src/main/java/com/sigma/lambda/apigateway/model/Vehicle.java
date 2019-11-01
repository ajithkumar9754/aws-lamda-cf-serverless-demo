package com.sigma.lambda.apigateway.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Vehicle {

    private int vin;
    private String make;
    private String model;
    private int year;


    public Vehicle(String json) {
        Gson gson = new Gson();
        Vehicle request = gson.fromJson(json, Vehicle.class);
        this.vin = request.getVin();
        this.make = request.getMake();
        this.model = request.getModel();
        this.year = request.getYear();
    }

    public String toString() {
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
