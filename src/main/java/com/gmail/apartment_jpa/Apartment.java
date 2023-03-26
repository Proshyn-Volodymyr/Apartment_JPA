package com.gmail.apartment_jpa;

public class Apartment {
    private int id;
    private String district;
    private Address address;
    private Integer square;
    private Integer amountOfRooms;
    private Integer price;

    public Apartment() {
    }

    public Apartment(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public Integer getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms(Integer amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "district='" + district + '\'' +
                ", square=" + square +
                ", amountOfRooms=" + amountOfRooms +
                ", price=" + price +
                '}';
    }
}
