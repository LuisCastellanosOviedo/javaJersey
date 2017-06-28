package com.example.javaJersey.javaJersey.Entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by luis on 6/28/2017.
 */


@XmlRootElement
public class Activity {

    private String name;
    private String description;
    private int time;

    public Activity() {
    }

    public Activity(String name, String description, int time) {


        this.name = name;
        this.description = description;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}


