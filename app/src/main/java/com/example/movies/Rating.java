package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rating implements Serializable {
    @SerializedName("kp")
    private double kp;

    public double getKp() {
        double scale = Math.pow(10, 1);
        kp = Math.ceil(kp * scale) / scale;
        return kp;
    }

    public Rating(double kp) {
        this.kp = kp;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "kp='" + kp + '\'' +
                '}';
    }
}
