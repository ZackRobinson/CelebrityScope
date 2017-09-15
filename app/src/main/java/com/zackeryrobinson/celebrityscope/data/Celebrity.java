package com.zackeryrobinson.celebrityscope.data;

/**
 * Created by Zack on 9/14/2017.
 */

public class Celebrity {

    String name;
    String shortDescription;
    int colorResource;

    public Celebrity(String name, String shortDescription, int colorResource) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.colorResource = colorResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getColorResource() {
        return colorResource;
    }

    public void setColorResource(int colorResource) {
        this.colorResource = colorResource;
    }
}
