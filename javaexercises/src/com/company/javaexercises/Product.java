package com.company.javaexercises;

public class Product{
    private int id;
    private String name;
    private double price;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public Product(){}
    public Product(int id, String name, double price){
        this();
        this.id=id;
        this.name=name;
        this.price = price;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
