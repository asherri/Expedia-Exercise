package com.sherri.exercise.controllers;

import com.sherri.exercise.filter.ParamsFilter;
import com.sherri.exercise.models.OfferDetails;
import com.sherri.exercise.rest.OffersApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Asherri on 07/07/2017.
 */

@Controller("/")
public class MainController {

    @Autowired
    OffersApi offersApi;

    @Autowired
    ParamsFilter paramsFilter;


    @RequestMapping
    public String home(HttpServletRequest request, Model model) {
        Map<String, String> filteredParams = paramsFilter.getFilteredParams(request);
        LinkedHashMap offerDetails = offersApi.findOffers(filteredParams);
        model.addAttribute("offerDetails", offerDetails);
        return "home";
    }
}
