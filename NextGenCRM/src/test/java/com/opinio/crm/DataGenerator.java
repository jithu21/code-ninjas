package com.opinio.crm;

import com.opinio.crm.common.CommonUtils;
import com.opinio.crm.entity.*;
import com.opinio.crm.service.CustomerService;
import com.opinio.crm.service.OrderService;
import com.opinio.crm.service.ProductService;
import org.apache.commons.lang3.time.DateUtils;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

/**
 * Created by Vineet on 14/05/16.
 */
@Service
public class DataGenerator {


    private static int date=0;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    DataFactory dataFactory = new DataFactory();

    private List<AreaData> areaDataList;

    private List<Customer> customers;

    private List<Product> products;

    private List<ProductData> productDataList;


    public void generateData() {
        IntStream.range(1, 100).forEach(i -> customerService.create(getCustomer()));
        this.initCustomers();
        IntStream.range(1, 12).forEach(i -> productService.save(getProduct()));
        this.initProducts();
        IntStream.range(1, 1000).forEach(i -> orderService.save(getOrder()));

    }

    public void cleanData() {
        customerService.deleteAll();
        productService.deleteAll();
        orderService.deleteAll();
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

    private Product getProduct() {
        Product product = new Product();
        product.setDescription(dataFactory.getRandomChars(10));
        product.setPrice(dataFactory.getNumberBetween(100, 300));
        ProductData productData = productDataList.get(getIndexFromList(productDataList));
        product.setName(productData.getNames());
        product.setProductCategory(productData.getProductCategory());
        return product;
    }

    private Order getOrder() {
        Order order = new Order();
        Customer customer = customers.get(getIndexFromList(customers));
        order.setCity(customer.getCity());
        order.setArea(customer.getLocation());
        order.setCustomerId(customer.getId());
        Date date = getTodaysDate();


        order.setOrderDate(date);
        order.setCustomerRating(dataFactory.getNumberBetween(1, 5));
        List<ProductInfo> productInfoList = new ArrayList<>();
        IntStream.range(0, dataFactory.getNumberBetween(1, 5)).forEach(i -> productInfoList.add(getProductInfo()));
        int totalPrice = productInfoList.stream().mapToInt(productInfo -> productInfo.getPrice() * productInfo.getQuantity()).sum();
        order.setProductInfoList(productInfoList);
        order.setTotalPrice(totalPrice);
        return order;
    }

    public ProductInfo getProductInfo() {
        Product product = products.get(getIndexFromList(products));
        ProductInfo productInfo = new ProductInfo();
        productInfo.setPrice(product.getPrice());
        productInfo.setQuantity(dataFactory.getNumberBetween(1, 2));
        productInfo.setProductId(product.getId());
        productInfo.setProductName(product.getName());
        productInfo.setProductCategory(product.getProductCategory());
        return productInfo;
    }


    public void initCustomers() {
        customers = customerService.getCustomers();
    }

    public void initProducts() {
        products = productService.getProducts();
    }

    private Date getTodaysDate() {
        long millisInDay = 60 * 60 * 24 * 1000;
        long currentTime = new Date().getTime();
        currentTime = currentTime - millisInDay*date;
        long dateOnly = (currentTime / millisInDay) * millisInDay;
        Date clearDate = new Date(dateOnly);
        return clearDate;
    }


    @PostConstruct

    public void init() {
        areaDataList = new ArrayList<>();
        productDataList = new ArrayList<>();
        areaDataList.addAll(asList(
                new AreaData("Karnataka", "Bengaluru", asList("BTM", "Kormangala", "HSR", "Belandur")),
                new AreaData("Maharashtra", "Pune", asList("Kharghar", "Aundh", "Baner", "Hinjewadi", "Magarpatta"))
        ));
        productDataList.addAll(asList(
                new ProductData(ProductCategory.AMERICAN, asList("Burger", "Sandwich", "Bread butter", "Wheat bread", "Salad")),
                new ProductData(ProductCategory.ITALIAN, asList("Pizza", "Pasta")),
                new ProductData(ProductCategory.SOUTH, asList("Dosa", "Idali", "Sambhar", "Pongal", "Rasam")),
                new ProductData(ProductCategory.NORTH, asList("Tanduri Chicken", "Paneer Kadhai", "Paneer Makhani"))

        ));
    }


    private AreaData getAreaData() {
        return areaDataList.get(getIndexFromList(areaDataList));

    }

    private int getIndexFromList(List list) {
        return CommonUtils.getRandomNumberInRange(0, list.size() - 1);
    }


    class ProductData {
        private ProductCategory productCategory;

        private List<String> names;

        public ProductData(ProductCategory productCategory, List<String> names) {
            this.productCategory = productCategory;
            this.names = names;
        }

        public ProductCategory getProductCategory() {
            return productCategory;
        }

        public void setProductCategory(ProductCategory productCategory) {
            this.productCategory = productCategory;
        }

        public String getNames() {
            return names.get(getIndexFromList(names));
        }

        public void setNames(List<String> names) {
            this.names = names;
        }
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
