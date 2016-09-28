package ProductInventory;

import java.util.HashMap;

public class Products{
    public int price;
    public String id;
    public int quantity;
    public Products(int price, String id, int quantity){
        this.price = price;
        this.id = id;
        this. quantity = quantity;

    }
    static String prodComputers = "Computers";
    static String computersQuantity = "$1,000 each , ID: 12332110 , Quantity: 10";
    static String prodPhones = "Phones";
    static String phonesQuantity = "$300 each, ID: 0987123, Quantity: 20";
    static String prodiPods = "iPods";
    static String iPodsQuantity = "$150 each, ID: 12567830 , Quantity: 30";


    public static HashMap<String,String> hashMap = new HashMap<String,String>();


    public static void main(String[] args){
        Products computers = new Products(1000, "123321", 10);
        Products phones = new Products(300, "0987123", 20);
        Products iPods = new Products(150 , "135678", 30);






        Products.hashMap.put(Products.prodComputers, Products.computersQuantity);
        Products.hashMap.put(Products.prodPhones, Products.phonesQuantity);
        Products.hashMap.put(Products.prodiPods, Products.iPodsQuantity);
        System.out.println(Products.hashMap.get(Products.prodComputers));
        System.out.println(Products.hashMap.get(Products.prodPhones));

    }
}