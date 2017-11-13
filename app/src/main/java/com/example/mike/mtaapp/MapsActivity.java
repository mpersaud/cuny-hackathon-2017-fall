package com.example.mike.mtaapp;
<<<<<<< HEAD

import android.content.res.AssetManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
=======
//package com.example.android.system.runtimepermissions;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
;
import android.Manifest;
import android.Manifest;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.drawable.BitmapDrawable;
import android.location.*;
import android.location.LocationListener;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.location.*;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
>>>>>>> "inserting files"
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
import java.security.Permission;
import java.util.ArrayList;
import java.util.List;


>>>>>>> "inserting files"
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private List<subwayStation> stationList = new ArrayList<>();

<<<<<<< HEAD
=======
    private void changeActivity(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

>>>>>>> "inserting files"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        AssetManager assetManager = getAssets();
<<<<<<< HEAD
        String line="";
=======
        String line = "";
>>>>>>> "inserting files"
        try {
            InputStream inputStream = assetManager.open("data.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            in.readLine();
<<<<<<< HEAD
            while((line = in.readLine()) != null) {
                String word = line.trim();
                String[] tokens =word.split(",");
=======
            while ((line = in.readLine()) != null) {
                String word = line.trim();
                String[] tokens = word.split(",");
>>>>>>> "inserting files"

                subwayStation s = new subwayStation(tokens);
                stationList.add(s);

            }

        } catch (IOException e) {
<<<<<<< HEAD
            Toast toast = Toast.makeText(this, "Could not load dictionary", Toast.LENGTH_LONG);
            toast.show();
        }
=======
            Toast toast = Toast.makeText(this, "Could not Load Database!", Toast.LENGTH_LONG);
            toast.show();
        }

>>>>>>> "inserting files"
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
<<<<<<< HEAD
=======
        Toast.makeText(this, "Choose a Borough.", Toast.LENGTH_LONG).show();
>>>>>>> "inserting files"
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

<<<<<<< HEAD
        // Add a marker in Sydney and move the camera


        for (subwayStation s: stationList) {
=======
        // Add a marker move the camera

        for (subwayStation s : stationList) {
>>>>>>> "inserting files"
            LatLng ll = new LatLng(s.getLatitude(), s.getLongitude());
            mMap.addMarker(new MarkerOptions()
                    .position(ll)
                    .title(s.getStopName())
<<<<<<< HEAD
                    .draggable(false));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ll));
        }
    }
}
=======
                    .draggable(false))
                    .setIcon(BitmapDescriptorFactory.fromAsset("subway.png")
                    );

            mMap.moveCamera(CameraUpdateFactory.newLatLng(ll));
        }

        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(40.7128, -74.0060)));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(11.5f));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                System.out.println(marker.getTitle());
                for (subwayStation s : stationList) {

                    if (marker.getTitle().equals(s.getStopName())) {
                        System.out.println(marker.getTitle());
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        i.putExtra("markerTitle",marker.getTitle());
                        i.setFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
                        startActivity(i);
                        return true;
                    }

                }
                return false;
            }
        });

    }




}

>>>>>>> "inserting files"
