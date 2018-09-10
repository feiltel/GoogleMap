package com.nutstudio.mymap;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        /**
         * 设置地图初始位置
         */
        LatLng sydney = new LatLng(39.99709957757345, 116.31184045225382);
        //也可以不加这句 ,这句是给初始位置加 marker
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        //获取线路数据
        String mapurl = getDirectionsUrl(new LatLng(39.99709957757345, 116.31184045225382), new LatLng(39.949158391497214, 116.4154639095068));
        getMapLine(mapurl);


        /**
         * 定位相关
         */
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            //开启定位
            mMap.setMyLocationEnabled(true);
        } else {
            // Show rationale and request permission.
        }

        mMap.setOnMyLocationButtonClickListener(new GoogleMap.OnMyLocationButtonClickListener() {
            @Override
            public boolean onMyLocationButtonClick() {
                return false;
            }
        });
        mMap.setOnMyLocationClickListener(new GoogleMap.OnMyLocationClickListener() {
            @Override
            public void onMyLocationClick(@NonNull Location location) {

            }
        });
    }

    private void getMapLine(String url) {
        Log.d("url", url);
        //这里可以换成你们使用的网络请求
        OkHttpManager.getAsyn(url, new OkHttpManager.ResultCallback() {
            @Override
            public void onError(Exception e) {

            }

            @Override
            public void onResponse(String string) {
                //成功处理
                success(string);
            }
        });
    }

    private void success(String json) {
        String s1 = json;
        JSONObject jObject;
        List<List<HashMap<String, String>>> routes = null;
        try {
            jObject = new JSONObject(s1);
            routes = MapUtils.parse(jObject);
            System.out.println("do in background:" + routes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mMap.addPolyline(getPolylineOptions(routes));
    }

    private PolylineOptions getPolylineOptions(List<List<HashMap<String, String>>> routes) {
        ArrayList<LatLng> points;
        PolylineOptions lineOptions = null;
        for (int i = 0; i < routes.size(); i++) {
            points = new ArrayList<>();
            lineOptions = new PolylineOptions();
            List<HashMap<String, String>> path = routes.get(i);
            for (int j = 0; j < path.size(); j++) {
                HashMap<String, String> point = path.get(j);

                double lat = Double.parseDouble(point.get("lat"));
                double lng = Double.parseDouble(point.get("lng"));
                LatLng position = new LatLng(lat, lng);

                points.add(position);
            }
            lineOptions.addAll(points);
            lineOptions.width(10);
            lineOptions.color(Color.BLACK);
        }
        return lineOptions;
    }

    private String getDirectionsUrl(LatLng origin, LatLng dest) {

        // Origin of route
        String str_origin = "origin=" + origin.latitude + ","
                + origin.longitude;

        // Destination of route
        String str_dest = "destination=" + dest.latitude + "," + dest.longitude;

        // Sensor enabled
        String sensor = "sensor=false";

        // Travelling Mode
        String mode = "mode=driving";

        //waypoints,116.32885,40.036675
        String waypointLatLng = "&" + "waypoints=" + "40.036675" + "," + "116.32885";
        waypointLatLng = "";

        // Building the parameters to the web service
        String parameters = str_origin + "&" + str_dest + "&" + sensor + "&"
                + mode + waypointLatLng;

        // Output format
        String output = "json";

        // Building the url to the web service
        String url = "https://maps.googleapis.com/maps/api/directions/"
                + output + "?" + parameters;
        System.out.println("getDerectionsURL--->: " + url);
        return url;
    }


}
