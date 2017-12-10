package com.lobo.rauffer.blog.domain;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 5480104608216778406L;

    private String name;
    private String lastname;
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
