
package com.sherri.exercise.models.offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferDateRange {

    private ArrayList<Integer> travelStartDate =  new ArrayList<>();
    private ArrayList<Integer> travelEndDate =  new ArrayList<>();
    private Integer lengthOfStay;

    public List<Integer> getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(ArrayList<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public List<Integer> getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(ArrayList<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

}
