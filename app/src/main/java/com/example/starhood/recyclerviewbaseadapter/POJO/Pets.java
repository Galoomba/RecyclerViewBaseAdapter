package com.example.starhood.recyclerviewbaseadapter.POJO;

/**
 * Created by starhood on 12/01/19.
 */

/**
 * implementing Test Case
 * Model Class for pets
 * **/
public class Pets {
    private String petType;
    private String petName;
    private String imgURl;

    public Pets(String petType, String petName, String imgURl) {
        this.petType = petType;
        this.petName = petName;
        this.imgURl = imgURl;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getImgURl() {
        return imgURl;
    }

    public void setImgURl(String imgURl) {
        this.imgURl = imgURl;
    }
}
