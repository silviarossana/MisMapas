package com.gt.silviarossana.mismapas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    /*class FirstMapActivity extends AppCompatActivity
            implements OnMapReadyCallback   */

    private GoogleMap mMap;
    private int MAPA_CAMBIO = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
        Bundle extras = getIntent().getExtras();
        MAPA_CAMBIO = extras.getInt(ConstantesMapas.BUNDLE_PAIS);
        LatLng lagInt = new LatLng(0,0);
        String nombrePais = "Error";



        switch (MAPA_CAMBIO) {

            case ConstantesMapas.PAIS_AUSTRALIA:
                    lagInt = ConstantesMapas.LATLOG_AUSTRALIA;
                    nombrePais = ConstantesMapas.PAIS_NOMBRE_AUSTRALIA;
                break;

            case ConstantesMapas.PAIS_EGIPTO:
                    lagInt = ConstantesMapas.LATLOG_EGIPTO;
                    nombrePais = ConstantesMapas.PAIS_NOMBRE_EGIPTO;
                break;

            case ConstantesMapas.PAIS_ESPANIA:
                    lagInt = ConstantesMapas.LATLOG_ESPANIA;
                    nombrePais = ConstantesMapas.PAIS_NOMBRE_ESPANIA;
                break;

            case ConstantesMapas.PAIS_GUATEMALA:
                    lagInt = ConstantesMapas.LATLOG_GUATEMALA;
                    nombrePais = ConstantesMapas.PAIS_NOMBRE_GUATEMALA;
                break;
        }



        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //LatLng mexico = new LatLng(15.577147194408493, -90.18997566250005);
        mMap.addMarker(new MarkerOptions().position(lagInt).title("Marker in " + nombrePais));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lagInt));
    }
}
