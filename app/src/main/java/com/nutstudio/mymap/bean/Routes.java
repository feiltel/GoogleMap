package com.nutstudio.mymap.bean;

import java.util.List;

public class Routes {

    private Bounds bounds;
    private String copyrights;
    private List<Legs> legs;
    private Overview_polyline overview_polyline;
    private String summary;
    private List<String> warnings;
    private List<Integer> waypoint_order;
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }
    public Bounds getBounds() {
        return bounds;
    }

    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }
    public String getCopyrights() {
        return copyrights;
    }

    public void setLegs(List<Legs> legs) {
        this.legs = legs;
    }
    public List<Legs> getLegs() {
        return legs;
    }

    public void setOverview_polyline(Overview_polyline overview_polyline) {
        this.overview_polyline = overview_polyline;
    }
    public Overview_polyline getOverview_polyline() {
        return overview_polyline;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getSummary() {
        return summary;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }
    public List<String> getWarnings() {
        return warnings;
    }

    public void setWaypoint_order(List<Integer> waypoint_order) {
        this.waypoint_order = waypoint_order;
    }
    public List<Integer> getWaypoint_order() {
        return waypoint_order;
    }

}