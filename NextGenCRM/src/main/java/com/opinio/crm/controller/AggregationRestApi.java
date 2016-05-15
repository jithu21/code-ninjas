package com.opinio.crm.controller;

import com.opinio.crm.entity.AggregationType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Subhodeep on 14/05/16.
 */
@Controller
@CrossOrigin
public class AggregationRestApi {

    @RequestMapping(value = "/runAgg/{aggType}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity runAggregation(@PathVariable AggregationType aggType) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
