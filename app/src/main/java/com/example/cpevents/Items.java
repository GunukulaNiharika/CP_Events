package com.example.cpevents;

public class Items {
    private String hosturl;
    private String hostname;
    private String contesturl;
    private String contestname;
    private String duration;
    private String end;


    public Items(String hosturl, String hostname, String contesturl, String contestname, String duration, String end) {
        this.hosturl = hosturl;
        this.hostname = hostname;
        this.contesturl = contesturl;
        this.contestname = contestname;
        this.duration = duration;
        this.end = end;
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

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
