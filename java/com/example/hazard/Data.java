package com.example.hazard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("hzd_locations")
    @Expose
    public String hzdLocations;
    @SerializedName("hzd_des")
    @Expose
    public String hzdDes;
    @SerializedName("longitude")
    @Expose
    public String longitude;
    @SerializedName("latitude")
    @Expose
    public String latitude;
    @SerializedName("datehzd")
    @Expose
    public String datehzd;
    @SerializedName("time")
    @Expose
    public String time;
    @SerializedName("name_report")
    @Expose
    public String nameReport;

}