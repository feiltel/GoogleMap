package com.nutstudio.mymap.bean;


import java.util.List;

/**
 * Auto-generated: 2018-08-29 16:49:14
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Geocoded_waypoints {

    private String geocoder_status;
    private String place_id;
    private List<String> types;
    public void setGeocoder_status(String geocoder_status) {
        this.geocoder_status = geocoder_status;
    }
    public String getGeocoder_status() {
        return geocoder_status;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }
    public String getPlace_id() {
        return place_id;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
    public List<String> getTypes() {
        return types;
    }

}