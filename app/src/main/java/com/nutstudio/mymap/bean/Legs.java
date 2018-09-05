package com.nutstudio.mymap.bean;

/**
 * Copyright 2018 bejson.com
 */

import java.util.List;

/**
 * Auto-generated: 2018-08-29 16:49:14
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Legs {

    private Distance distance;
    private Duration duration;
    private String end_address;
    private End_location end_location;
    private String start_address;
    private Start_location start_location;
    private List<Steps> steps;
    private List<String> traffic_speed_entry;
    private List<String> via_waypoint;
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

    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }
    public String getEnd_address() {
        return end_address;
    }

    public void setEnd_location(End_location end_location) {
        this.end_location = end_location;
    }
    public End_location getEnd_location() {
        return end_location;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }
    public String getStart_address() {
        return start_address;
    }

    public void setStart_location(Start_location start_location) {
        this.start_location = start_location;
    }
    public Start_location getStart_location() {
        return start_location;
    }

    public void setSteps(List<Steps> steps) {
        this.steps = steps;
    }
    public List<Steps> getSteps() {
        return steps;
    }

    public void setTraffic_speed_entry(List<String> traffic_speed_entry) {
        this.traffic_speed_entry = traffic_speed_entry;
    }
    public List<String> getTraffic_speed_entry() {
        return traffic_speed_entry;
    }

    public void setVia_waypoint(List<String> via_waypoint) {
        this.via_waypoint = via_waypoint;
    }
    public List<String> getVia_waypoint() {
        return via_waypoint;
    }

}
