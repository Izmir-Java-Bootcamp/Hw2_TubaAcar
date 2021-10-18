package com.kodluyoruz;

public class Main {

    public static void askCustomer(Cart cart){

    }

    public static void main(String[] args) {
        println("Welcome to kodluyoruz shop");
        println("What’s your name?");
        String customer = readLine();
        println("Hi "+customer+". Please choose one of the following options:");
        println("");
        Cart cart = new Cart();
    }
}

public class Cart{

    private final Product[] products = new Product[100];

    private int position =0;

    public Product[] getProducts(){
    }

    public void addProduct(Product product) {
    }
    public void addProducts(Product[] products) {
    }

    public void addProduct(Product product, int howManyTimes) {

    }

    public double totalPrice(){

    }

    public String toString() {
        String result = "";

        return result;
    }
}

public class Product {

    private final String seller;

    private final String name;

    private final double price;

    public Product(String seller, String name, double price) {
    }

    public Product(Product original) {
    }
    public final String getSeller() {
    }
    public final String getName() {
    }

    public double getPrice(Cart cart) {

    }
    public boolean canBeReduced() {

        return true;
    }
    public String toString() {
    }
}
public class DiscountedProduct extends Product {

    private final Product original;

    private final double discount;

    public DiscountedProduct(Product original, double discount) {

    }
    public double getPrice(Cart cart) {
    }
    public String toString() {
    }
}
public class Buy2Take3Product extends Product {

    private final Product original;
    public Buy2Take3Product(Product original) {

    }
    public boolean canBeReduced() {
    }
    public double getPrice(Cart cart) {
    }