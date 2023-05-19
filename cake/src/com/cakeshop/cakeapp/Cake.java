package com.cakeshop.cakeapp;

public class Cake {
        private int cakeId;
        private String shape;
        private String color;
        private String flaver;
        private double price;

        public int getCakeId() {
            return cakeId;
        }
        public void setCakeId(int cakeId) {
            this.cakeId = cakeId;
        }
        public String getShape(){
            return shape;
        }
        public void setShape(String shape){
            this.shape=shape;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color=color;
        }
        public String getFlaver(){
            return flaver;
        }
        public void setFlaver(String flaver){
            this.flaver=flaver;
        }
        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price=price;
        }
    }

