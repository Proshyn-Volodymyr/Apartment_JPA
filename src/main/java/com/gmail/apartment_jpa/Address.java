package com.gmail.apartment_jpa;

public class Address {
    private String countryName;
    private String cityName;
    private String streetName;
    private Integer buildingNumber;
    private Integer apNumber;
    private Integer index;

    public Address(Builder builder) {
        this.countryName = builder.countryName;
        this.cityName = builder.cityName;
        this.streetName = builder.streetName;
        this.buildingNumber = builder.buildingNumber;
        this.apNumber = builder.apNumber;
        this.index = builder.index;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getApNumber() {
        return apNumber;
    }

    public void setApNumber(int apNumber) {
        this.apNumber = apNumber;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static class Builder {
        private String countryName;
        private String cityName;
        private String streetName;
        private Integer buildingNumber;
        private Integer apNumber;
        private Integer index;

        public Builder() {
        }

        public Builder countryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public Builder cityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public Builder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder buildingNumber(Integer buildingNumber) {
            this.buildingNumber = buildingNumber;
            return this;
        }

        public Builder apNumber(Integer apNumber) {
            this.apNumber = apNumber;
            return this;
        }

        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        public Address build() {
            Address address = new Address(this);
            return address;
        }
    }
}
