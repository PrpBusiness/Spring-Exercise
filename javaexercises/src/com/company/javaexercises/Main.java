package com.company.javaexercises;

public class Main {

    public static void main(String[] args) {
        Category category = new Category(1,"Gıda");
        Product product = new Product(1,"Portakal",1614900);
        ProductManager productManager= new ProductManager();
        productManager.addToCart(product);
        productManager.disCount(product,10,category);

    }
}
