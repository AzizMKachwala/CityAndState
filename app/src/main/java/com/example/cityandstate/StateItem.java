package com.example.cityandstate;

import java.util.List;

public class StateItem {

    String stateName;
    List<CityItem> cities;

    public StateItem(String stateName, List<CityItem> cities) {
        this.stateName = stateName;
        this.cities = cities;
    }

    public String getStateName() {
        return stateName;
    }

    public List<CityItem> getCities() {
        return cities;
    }
}
