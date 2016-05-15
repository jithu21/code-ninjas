# code-ninjas


We are building a tool to help  the Customer Relationship Manager to target right customers for there new promotions and offers. The tool helps the CRM to run campaigns based on different categories like food, location and other aspects. We built this assuming that we have the complete customer database ie. (Customer,Order and Product) information for our reporting and analysis.

Tech Stack

1) Angular Js

2) Gulp

3) MongoDB

4) Java Spring


Data Models


1) Customer 

{
   "_id" : ObjectId("5737132ba826314d8d637c8e"),
   "_class" : "com.opinio.crm.entity.Customer",
   "firstName" : "Lindsey",
   "address" : "1110 Harlan Court",
   "phoneNumber" : "9",
   "lastName" : "Craft",
   "city" : "Bengaluru",
   "location" : "HSR",
   "email" : "wsantiago@yah00.biz"
}

2) Order

{
   "_id" : ObjectId("5737132ba826314d8d637cfc"),
   "_class" : "com.opinio.crm.entity.Order",
   "customerId" : "5737132ba826314d8d637cc2",
   "productInfoList" : [ 
       {
           "_id" : ObjectId("5737132ba826314d8d637cf4"),
           "productName" : "Sandwich",
           "productCategory" : "AMERICAN",
           "price" : 257,
           "quantity" : 1
       }, 
       {
           "_id" : ObjectId("5737132ba826314d8d637cf9"),
           "productName" : "Sambhar",
           "productCategory" : "SOUTH",
           "price" : 221,
           "quantity" : 1
       }, 
       {
           "_id" : ObjectId("5737132ba826314d8d637cf7"),
           "productName" : "Paneer Makhani",
           "productCategory" : "NORTH",
           "price" : 122,
           "quantity" : 1
       }, 
       {
           "_id" : ObjectId("5737132ba826314d8d637cf1"),
           "productName" : "Paneer Makhani",
           "productCategory" : "NORTH",
           "price" : 229,
           "quantity" : 1
       }
   ],
   "totalPrice" : 829,
   "area" : "Kharghar",
   "city" : "Pune",
   "orderDate" : ISODate("2016-05-14T00:00:00.000Z"),
   "customerRating" : 4
}

3) Product

{
   "_id" : ObjectId("5737132ba826314d8d637cf1"),
   "_class" : "com.opinio.crm.entity.Product",
   "name" : "Paneer Makhani",
   "description" : "niwfsqdmjk",
   "price" : 229,
   "productCategory" : "NORTH"
}
