package com.agalesanu;

public class Rocket {

    private float width;
    private float height;
    private String color;

    public Rocket(float width, float height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public float sumWidthAndHeight(){
        return this.width + this.height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
