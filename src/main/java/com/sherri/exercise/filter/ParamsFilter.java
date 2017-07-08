package com.sherri.exercise.filter;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Asherri on 07/07/2017.
 */

@Component
public class ParamsFilter {

    private String[] allowedParams = new String[]{
            "destinationCity",
            "destinationName",
            "regionIds",
            "minTripStartDate",
            "maxTripStartDate",
            "lengthOfStay",
            "maxStarRating",
            "minStarRating",
            "maxTotalRate",
            "minTotalRate",
            "maxGuestRating",
            "minGuestRating"
    };

    public Map<String, String> getFilteredParams(HttpServletRequest request) {
        Map<String, String> params = new HashMap<>();
        for (String allowedParam : allowedParams) {
            String param = request.getParameter(allowedParam);
            if (param != null && !param.isEmpty()) {
                params.put(allowedParam, param);
            }
        }
        return params;
    }


}
