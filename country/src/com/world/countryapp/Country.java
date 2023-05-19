package com.world.countryapp;

public class Country {
        private int countryId;
        private int countryCode;
        private String countryName;
        private int noOfStates;
        private String population;
        private String currency;
        private String capital;
        private String economy;

        public int getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        public int getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public int getNoOfStates() {
            return noOfStates;
        }

        public void setNoOfStates(int noOfStates) {
            this.noOfStates = noOfStates;
        }

        public String getPopulation(){
            return population;
        }

        public void setPopulation(String population) {
            this.population = population;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getCapital() {
            return capital;
        }

        public void setCapital(String capital) {
            this.capital = capital;
        }

        public String getEconomy() {
            return economy;
        }

        public void setEconomy(String economy) {
            this.economy = economy;
        }
    }

