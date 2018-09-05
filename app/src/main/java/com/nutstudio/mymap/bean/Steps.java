package com.nutstudio.mymap.bean;

/**
 * Copyright 2018 bejson.com
 */


/**
 * Auto-generated: 2018-08-29 16:49:14
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Steps {

    private Distance distance;
    private Duration duration;
    private End_location end_location;
    private String html_instructions;
    private Polyline polyline;
    private Start_location start_location;
    private String travel_mode;
    public void setDistance(Distance distance) {
        this.distance = distance;
    }
    public Distance getDistance() {
        return distance;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    public Duration getDuration() {
        return duration;
    }

    public void setEnd_location(End_location end_location) {
        this.end_location = end_location;
    }
    public End_location getEnd_location() {
        return end_location;
    }

    public void setHtml_instructions(String html_instructions) {
        this.html_instructions = html_instructions;
    }
    public String getHtml_instructions() {
        return html_instructions;
    }

    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
    }
    public Polyline getPolyline() {
        return polyline;
    }

    public void setStart_location(Start_location start_location) {
        this.start_location = start_location;
    }
    public Start_location getStart_location() {
        return start_location;
    }

    public void setTravel_mode(String travel_mode) {
        this.travel_mode = travel_mode;
    }
    public String getTravel_mode() {
        return travel_mode;
    }

}