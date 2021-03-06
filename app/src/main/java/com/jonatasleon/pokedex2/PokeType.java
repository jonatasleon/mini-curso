package com.jonatasleon.pokedex2;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jonatasleon on 21/09/16.
 */
public class PokeType {

    @SerializedName("name")
    private String name;

    public PokeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
