
package com.sherri.exercise.models.hotel;

import java.util.HashMap;
import java.util.Map;

public class HotelPricingInfo {

    private Double averagePriceValue;
    private Double totalPriceValue;
    private String originalPricePerNight;
    private Double hotelTotalBaseRate;
    private Double hotelTotalTaxesAndFees;
    private String currency;
    private Double hotelTotalMandatoryTaxesAndFees;
    private Double percentSavings;
    private Boolean drr;

    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public String getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(String originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public Double getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    public void setHotelTotalBaseRate(Double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    public Double getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getHotelTotalMandatoryTaxesAndFees() {
        return hotelTotalMandatoryTaxesAndFees;
    }

    public void setHotelTotalMandatoryTaxesAndFees(Double hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    public Double getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    public Boolean getDrr() {
        return drr;
    }

    public void setDrr(Boolean drr) {
        this.drr = drr;
    }

}
