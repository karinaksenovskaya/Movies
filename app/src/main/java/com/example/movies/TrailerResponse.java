package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TrailerResponse {
    @SerializedName("videos")
    private final TrailersList trailersList;

    public TrailerResponse(TrailersList trailersList) {
        this.trailersList = trailersList;
    }

    public TrailersList getTrailersList() {
        return trailersList;
    }

    @Override
    public String toString() {
        return "TrailerResponse{" +
                "trailersList=" + trailersList +
                '}';
    }
}
