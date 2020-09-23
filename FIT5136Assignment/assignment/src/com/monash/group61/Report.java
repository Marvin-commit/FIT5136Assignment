package com.monash.group61;

import java.util.Date;

public class Report {
    private String type;
    private Date timePeriod;

    public Report() {
    }

    public Report(String type, Date timePeriod) {
        this.type = type;
        this.timePeriod = timePeriod;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Date timePeriod) {
        this.timePeriod = timePeriod;
    }
}
