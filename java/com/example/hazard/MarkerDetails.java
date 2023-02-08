package com.example.hazard;

public class MarkerDetails {

    String location;
    String snippet;
    String date;
    String time;
    String reportName;

    MarkerDetails(String location, String snippet, String date, String time, String reportName) {
        this.location = location;
        this.snippet = snippet;
        this.date = date;
        this.time = time;
        this.reportName = reportName;
    }
}
