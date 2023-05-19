package com.woodland.footwareapp;

public class Footware {
    int footwareId;
    String brand;
    int size;
    String type;
    double price;
    String materialType;

    public void setFootwareId(int footwareId){
        this.footwareId=footwareId;
    }
    public int getFootwareId(){
        return footwareId;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setMaterialType(String materialType){
        this.materialType=materialType;
    }
    public String getMaterialType(){
        return materialType;
    }
}
