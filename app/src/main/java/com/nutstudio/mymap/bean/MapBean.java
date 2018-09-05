package com.nutstudio.mymap.bean;

import java.util.List;

public class MapBean {


        private List<Geocoded_waypoints> geocoded_waypoints;
        private List<Routes> routes;
        private String status;
        public void setGeocoded_waypoints(List<Geocoded_waypoints> geocoded_waypoints) {
            this.geocoded_waypoints = geocoded_waypoints;
        }
        public List<Geocoded_waypoints> getGeocoded_waypoints() {
            return geocoded_waypoints;
        }

        public void setRoutes(List<Routes> routes) {
            this.routes = routes;
        }
        public List<Routes> getRoutes() {
            return routes;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public String getStatus() {
            return status;
        }


}
