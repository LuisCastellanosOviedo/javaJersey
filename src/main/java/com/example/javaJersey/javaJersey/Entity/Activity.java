package com.example.javaJersey.javaJersey.Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by luis on 6/28/2017.
 */


@XmlRootElement
public class Activity {

    private String name;
    private String description;
    private int time;
    private User user;


    public Activity() {
    }

    public Activity(String name, String description, int time) {


        this.name = name;
        this.description = description;
        this.time = time;
    }

    @XmlElement(name = " name nombre ")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = " description  descripcion ")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = " time duracion en horas  ")
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


