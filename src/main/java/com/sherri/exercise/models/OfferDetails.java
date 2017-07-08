
package com.sherri.exercise.models;

import com.sherri.exercise.models.offer.OfferInfo;
import com.sherri.exercise.models.offer.Offers;
import com.sherri.exercise.models.user.UserInfo;

import java.util.HashMap;
import java.util.Map;

public class OfferDetails {

    private OfferInfo offerInfo;
    private UserInfo userInfo;
    private Offers offers;

    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Offers getOffers() {
        return offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

}
