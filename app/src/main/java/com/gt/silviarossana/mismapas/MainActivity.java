package com.gt.silviarossana.mismapas;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicIrMapaAustralia(View v){

        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(ConstantesMapas.BUNDLE_PAIS, ConstantesMapas.PAIS_AUSTRALIA);

        startActivity(intent);
    }

    public void clicIrMapaEgipto(View v){

        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(ConstantesMapas.BUNDLE_PAIS, ConstantesMapas.PAIS_EGIPTO);

        startActivity(intent);
    }

    public void clicIrMapaEspania(View v){

        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(ConstantesMapas.BUNDLE_PAIS, ConstantesMapas.PAIS_ESPANIA);

        startActivity(intent);
    }

    public void clicIrMapaGuatemala(View v){

        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(ConstantesMapas.BUNDLE_PAIS, ConstantesMapas.PAIS_GUATEMALA);

        startActivity(intent);
    }


}
