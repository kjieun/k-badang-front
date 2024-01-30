package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class DataModel3 {

    @SerializedName("name")
    private String name;
    @SerializedName("dividendCash")
    private Double dividendCash;
    @SerializedName("months")
    private List<Integer> months;

    @SerializedName("year")
    private String year;
    @SerializedName("dividendHistories")
    private List<DataModel4> dividendHistories;
    @SerializedName("dividendYieldRatio")
    private Double dividendYieldRatio;


    public String getDividendYieldRatio() {
        return String.format("%.2f", dividendYieldRatio*100);
    }

    public String getName() {
        return name;
    }

    public String getDividendCash() {
        return  ""+((int) Math.round(dividendCash));
    }

    public List<Integer> getMonths() {
        return months;
    }

    public String getYear() {
        return year;
    }

    public List<DataModel4> getDividendHistories() {
        return dividendHistories;
    }
}