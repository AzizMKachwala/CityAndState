package com.example.cityandstate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<StateItem> stateList = new ArrayList<>();

        List<CityItem> citiesForState1 = new ArrayList<>();
        citiesForState1.add(new CityItem("Vadodara"));
        citiesForState1.add(new CityItem("Ahmedabad"));
        citiesForState1.add(new CityItem("Amreli"));
        citiesForState1.add(new CityItem("Ghandhinagar"));
        citiesForState1.add(new CityItem("Rajkot"));
        citiesForState1.add(new CityItem("Surat"));
        citiesForState1.add(new CityItem("Anand"));
        citiesForState1.add(new CityItem("Bharuch"));
        citiesForState1.add(new CityItem("Bhavnagar"));
        stateList.add(new StateItem("Gujarat", citiesForState1));

        List<CityItem> citiesForState2 = new ArrayList<>();
        citiesForState2.add(new CityItem("Mumbai"));
        citiesForState2.add(new CityItem("Pune"));
        citiesForState2.add(new CityItem("Nagpur"));
        citiesForState2.add(new CityItem("Thane"));
        citiesForState2.add(new CityItem("Nashik"));
        citiesForState2.add(new CityItem("Solapur"));
        citiesForState2.add(new CityItem("Aurangabad"));
        citiesForState2.add(new CityItem("Kolhapur"));
        citiesForState2.add(new CityItem("Sangli"));
        stateList.add(new StateItem("Maharashtra", citiesForState2));

        List<CityItem> citiesForState3 = new ArrayList<>();
        citiesForState3.add(new CityItem("Jaipur"));
        citiesForState3.add(new CityItem("Jodhpur"));
        citiesForState3.add(new CityItem("Udaipur"));
        citiesForState3.add(new CityItem("Bharatpur"));
        citiesForState3.add(new CityItem("Ajmer"));
        citiesForState3.add(new CityItem("Dhaulpur"));
        citiesForState3.add(new CityItem("Kishangarh"));
        citiesForState3.add(new CityItem("Kota"));
        citiesForState3.add(new CityItem("Bikaner"));
        stateList.add(new StateItem("Rajasthan", citiesForState3));

        RecyclerView StateRecyclerView = findViewById(R.id.stateRecyclerView);
        StateRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        StateAdapter stateAdapter = new StateAdapter(stateList);
        StateRecyclerView.setAdapter(stateAdapter);
    }
}
