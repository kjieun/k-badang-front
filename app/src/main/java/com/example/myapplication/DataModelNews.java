package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModelNews {

    @SerializedName("subject")
    private String subject;
    @SerializedName("summary")
    private List<String> summary;

    public String getSubject() {
        return subject;
    }

    public List<String> getSummary() {
        return summary;
    }
}