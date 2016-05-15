package com.opinio.crm.controller;

import com.opinio.crm.entity.AggregationType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Subhodeep on 14/05/16.
 */
@Controller
public class AggregationRestApi {

    @RequestMapping(value = "/runAgg/{aggType}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity runAggregation(@PathVariable AggregationType aggType) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
