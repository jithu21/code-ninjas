package com.opinio.crm.dto;

import java.util.*;

/**
 * Created by Subhodeep on 14/05/16.
 */
public class GenericResponseDTO {
    private List<String> params = new ArrayList<>();
    private List<Map<String, String>> values = new LinkedList<>();


    public void addParam(String param) {
        params.add(param);
    }
    public void addValue(Map<String, String> value) {
        values.add(value);
    }
}
