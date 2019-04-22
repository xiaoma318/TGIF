package com.cm.dub;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Charlie on 4/16/19.
 */

public class Person {
    @Expose
    @SerializedName("id")
    private Integer id;
    @Expose
    @SerializedName("imdb_id")
    private String imdbId;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("place_of_birth")
    private String placeOfBirth;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", imdbId='" + imdbId + '\'' +
                ", name='" + name + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                '}';
    }



    // bunch of boring getters and setters
}
