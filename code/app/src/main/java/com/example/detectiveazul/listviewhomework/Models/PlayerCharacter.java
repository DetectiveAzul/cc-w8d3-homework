package com.example.detectiveazul.listviewhomework.Models;

import java.io.Serializable;

public class PlayerCharacter implements Serializable {
    private String name;
    private String c_class;
    private Integer level;

    public PlayerCharacter (String name, String c_class, Integer level) {
        this.name = name;
        this.c_class = c_class;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getC_class() {
        return c_class;
    }

    public Integer getLevel() {
        return level;
    }
}
