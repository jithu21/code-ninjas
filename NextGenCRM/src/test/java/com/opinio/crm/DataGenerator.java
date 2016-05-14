package com.opinio.crm;

import com.opinio.crm.common.CommonUtils;
import com.opinio.crm.entity.Customer;
import com.opinio.crm.service.CustomerService;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

/**
 * Created by Vineet on 14/05/16.
 */
@Service
public class DataGenerator {

    @Autowired
    private CustomerService customerService;

    DataFactory dataFactory = new DataFactory();

    private List<AreaData> areaDataList;

    private List<String> area;


    public void generateData() {
        generateCustomers();
    }


    private void generateCustomers() {
        IntStream.range(1, 100).forEach(i -> customerService.create(getCustomer()));

    }

    private Customer getCustomer() {
        Customer customer = new Customer();
        customer.setFirstName(dataFactory.getFirstName());
        customer.setLastName(dataFactory.getLastName());
        customer.setAddress(dataFactory.getAddress());
        customer.setEmail(dataFactory.getEmailAddress());
        AreaData areaData = getAreaData();
        customer.setLocation(areaData.getArea());
        customer.setCity(areaData.getCity());
        customer.setPhoneNumber(String.valueOf(dataFactory.getNumberBetween(9, 10)));
        return customer;
    }


    @PostConstruct

    public void init() {
        areaDataList = new ArrayList<AreaData>();
        areaDataList.addAll(asList(
                //new AreaData("Mumbai", asList("Kharghar", "Navi Mumbai", "Nerul", "Belapur")),
                //new AreaData("Delhi", asList("Delhi", "Chandani Chowk", "Canaght Place"")),
                new AreaData("Karnataka", "Bengaluru", asList("BTM", "Kormangala", "HSR", "Belandur")),
                new AreaData("Maharashtra", "Pune", asList("Kharghar", "Aundh", "Baner", "Hinjewadi", "Magarpatta"))
        ));
    }


    private AreaData getAreaData() {
        return areaDataList.get(getIndexFromList(areaDataList));

    }

    private int getIndexFromList(List list) {
        return CommonUtils.getRandomNumberInRange(0, areaDataList.size()-1);
    }


    class AreaData {
        private String state;
        private List<String> area;
        private String city;


        public AreaData(String state, String city, List<String> area) {
            this.area = area;
            this.city = city;
            this.state = state;
        }

        public String getArea() {
            return area.get(getIndexFromList(area));
        }


        public void setArea(List<String> area) {
            this.area = area;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }


}
