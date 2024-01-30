package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class DataModel2 {

    @SerializedName("id")
    private String id;

    @SerializedName("stock_name")
    private String stock_name;

    @SerializedName("payment_period")
    private String payment_period;


    public String getId() {
        return id;

    }
    public String getStock_name() {
        return stock_name;
    }

    public String getPayment_period() {
        return payment_period.split("T")[0];
    }


    @Override
    public String toString() {
        return "DataModel2{" +
                "id='" + id + '\'' +
                ", stock_name='" + stock_name + '\'' +
                ", payment_period='" + payment_period + '\'' +
                '}';
    }
}