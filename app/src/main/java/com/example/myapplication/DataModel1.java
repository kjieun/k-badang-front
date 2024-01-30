package com.example.myapplication;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModel1 {

    @SerializedName("id")
    private String id;

    @SerializedName("stock_name")
    private String stock_name;

    @SerializedName("payment_period")
    private String payment_period;

    @SerializedName("base_date")
    private String base_date;
    @SerializedName("member_num")
    private String member_num;
    @SerializedName("stock_type")
    private String stock_type;
    @SerializedName("cash_rate")
    private Double cash_rate;
    @SerializedName("stock_rate")
    private Double stock_rate;
    @SerializedName("short_holding")
    private Double short_holding;
    @SerializedName("cash_price")
    private Double cash_price;
    @SerializedName("stock_price")
    private Double stock_price;
    @SerializedName("pledged_share")
    private String pledged_share;
    @SerializedName("stock_date")
    private String stock_date;
    @SerializedName("income_tax")
    private Double income_tax;
    @SerializedName("resident_tax")
    private Double resident_tax;
    @SerializedName("first_paydate")
    private String first_paydate;
    @SerializedName("second_paydate")
    private String second_paydate;
    @SerializedName("place")
    private String place;

    public String getId() {
        return id;

    }

    public String getStock_name() {
        return stock_name;
    }

    public String getPayment_period() {
        return payment_period.split("T")[0];
    }

    public String getBase_date() {
        return base_date.split("T")[0];
    }

    public String getMember_num() {
        return member_num;
    }

    public String getStock_type() {
        return stock_type;
    }

    public String getCash_rate() {
        return ""+((int) Math.round(cash_rate * 100));
    }

    public String getStock_rate() {
        return ""+((int) Math.round(stock_rate * 100));
    }

    public String getShort_holding() {
        return ""+((int) Math.round(short_holding));
    }

    public String getCash_price() {
        return ""+((int) Math.round(cash_price));
    }

    public String getStock_price() {
        return ""+((int) Math.round(stock_price));
    }

    public String getPledged_share() {
        return pledged_share;
    }

    public String getStock_date() {
        return stock_date.split("T")[0];
    }

    public String getIncome_tax() {
        return ""+((int) Math.round(income_tax));
    }

    public String getResident_tax() {
        return ""+((int) Math.round(resident_tax));
    }

    public String getFirst_paydate() {
        return first_paydate.split("T")[0];
    }

    public String getSecond_paydate() {
        return second_paydate.split("T")[0];
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "DataModel1{" +
                "id='" + id + '\'' +
                ", stock_name='" + stock_name + '\'' +
                ", payment_period='" + payment_period + '\'' +
                ", base_date='" + base_date + '\'' +
                ", member_num='" + member_num + '\'' +
                ", stock_type='" + stock_type + '\'' +
                ", cash_rate='" + cash_rate + '\'' +
                ", stock_rate='" + stock_rate + '\'' +
                ", short_holding='" + short_holding + '\'' +
                ", cash_price='" + cash_price + '\'' +
                ", stock_price='" + stock_price + '\'' +
                ", pledged_share='" + pledged_share + '\'' +
                ", stock_date='" + stock_date + '\'' +
                ", income_tax='" + income_tax + '\'' +
                ", resident_tax='" + resident_tax + '\'' +
                ", first_paydate='" + first_paydate + '\'' +
                ", second_paydate='" + second_paydate + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}