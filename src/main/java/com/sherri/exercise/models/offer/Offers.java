
package com.sherri.exercise.models.offer;

import com.sherri.exercise.models.hotel.Hotel;

import java.util.*;

public class Offers {

    private LinkedHashMap Hotel = new LinkedHashMap<>();

    public LinkedHashMap getHotel() {
        return Hotel;
    }
    public void setHotel(LinkedHashMap hotel) {
        this.Hotel = hotel;
    }
}
