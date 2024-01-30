package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModel4 {

    @SerializedName("exDate")
    private String exDate;
    @SerializedName("paymentDate")
    private String paymentDate;
    @SerializedName("tendency")
    private String tendency;

    @SerializedName("ratio")
    private String ratio;
    @SerializedName("cashKrw")
    private String cashKrw;

    public String getExDate() {
        return exDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getTendency() {
        return tendency;
    }

    public String getRatio() {
        return "6.325";
    }

    public String getCashKrw() {
        return cashKrw;
    }
}