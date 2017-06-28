package com.example.javaJersey.javaJersey.Entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by luis on 6/28/2017.
 */


@XmlRootElement
public class User {

    private String name;
    private  String nickname;

    public User(String name, String nickname) {

        this.name = name;
        this.nickname = nickname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
