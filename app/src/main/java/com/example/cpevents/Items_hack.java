package com.example.cpevents;

public class Items_hack {
    private String hosturl;
    private String hostname;
    private String contesturl;
    private String contestname;
    private String duration;
    private String end_date;
    private String start_date;
    private String location;

    public Items_hack(String hosturl, String hostname, String contesturl, String contestname, String duration, String end_date, String start_date, String location) {
        this.hosturl = hosturl;
        this.hostname = hostname;
        this.contesturl = contesturl;
        this.contestname = contestname;
        this.duration = duration;
        this.end_date = end_date;
        this.start_date = start_date;
        this.location = location;
    }

    public String getHosturl() {
        return hosturl;
    }

    public void setHosturl(String hosturl) {
        this.hosturl = hosturl;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getContesturl() {
        return contesturl;
    }

    public void setContesturl(String contesturl) {
        this.contesturl = contesturl;
    }

    public String getContestname() {
        return contestname;
    }

    public void setContestname(String contestname) {
        this.contestname = contestname;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
