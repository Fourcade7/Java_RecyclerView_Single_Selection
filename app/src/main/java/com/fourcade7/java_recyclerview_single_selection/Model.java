package com.fourcade7.java_recyclerview_single_selection;

public class Model {

    String  image;
    String name;
    boolean selected=false;

    public Model(String image, String name) {
        this.image = image;
        this.name = name;

    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
