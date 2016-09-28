package ProductInventory;



public class Inventory{

    public void viewInventory(){
        System.out.println(Products.hashMap.get(Products.prodComputers));
        System.out.println(Products.hashMap.get(Products.prodPhones));
        System.out.println(Products.hashMap.get(Products.prodiPods));
    }
}
