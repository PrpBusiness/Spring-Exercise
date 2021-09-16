package com.company.javaexercises;

public class ProductManager {
    public void addToCart(Product product){
        System.out.println(product.getName()+" Sepete Eklendi");
    }
    public void disCount(Product product, double discountRate, Category category){
        System.out.println(product.getName()+" Ürünü için "+product.getPrice()+"TL Fiyatına %"+discountRate+" indirim yapılmıştır. İlgili Kategori: "+category.getName());
        double yeniFiyat=product.getPrice()-((product.getPrice()*discountRate)/100);
        System.out.println("Yeni Fiyat: "+yeniFiyat+" TL");
    }
}
