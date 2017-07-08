
package com.sherri.exercise.models.hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelUrgencyInfo {

    private Integer airAttachRemainingTime;
    private Integer numberOfPeopleViewing;
    private Integer numberOfPeopleBooked;
    private Integer numberOfRoomsLeft;
    private Integer lastBookedTime;
    private String almostSoldStatus;
    private String link;
    private ArrayList almostSoldOutRoomTypeInfoCollection =  new ArrayList<>();
    private Boolean airAttachEnabled;

    public Integer getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    public void setAirAttachRemainingTime(Integer airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    public Integer getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    public void setNumberOfPeopleViewing(Integer numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    public Integer getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(Integer numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public Integer getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    public void setNumberOfRoomsLeft(Integer numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    public Integer getLastBookedTime() {
        return lastBookedTime;
    }

    public void setLastBookedTime(Integer lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Object> getAlmostSoldOutRoomTypeInfoCollection() {
        return almostSoldOutRoomTypeInfoCollection;
    }

    public void setAlmostSoldOutRoomTypeInfoCollection(ArrayList almostSoldOutRoomTypeInfoCollection) {
        this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
    }

    public Boolean getAirAttachEnabled() {
        return airAttachEnabled;
    }

    public void setAirAttachEnabled(Boolean airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }

}
