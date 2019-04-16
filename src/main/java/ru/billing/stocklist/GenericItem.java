package ru.billing.stocklist;

import java.util.Objects;

public class GenericItem {

    private static int currentID;
    private int id;
    private String name;
    private GenericItem analog = null;
    private float price;
    private Category category = Category.GENERAL;

    public static int getCurrentID() {
        return currentID;
    }

    public Category getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public GenericItem(String name, float price, Category category) {//3 lab

        this.name = name;
        this.price = price;
        this.category = category;
        this.id = GenericItem.currentID++;
    }


    GenericItem(String name, float price, GenericItem analog) {//3lab

        this.name = name;
        this.price = price;
        this.category = analog.category;
        this.analog = analog;
        this.id = GenericItem.currentID++;

    }

    public GenericItem(String name, float price, Category category, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.analog = analog;
        this.id = GenericItem.currentID++;
    }

    GenericItem() {
    }

    public void printAll() {

        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , Category: %-20s \n", getId(), getName(), getPrice(), getCategory().name());

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        GenericItem o = (GenericItem) object;
        return (this.name.equals(o.name) && this.category.equals(o.category) && this.price == o.price && this.id == o.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, category);
    }

    @Override
    public GenericItem clone() {

        GenericItem item = new GenericItem();
        this.setCategory(item.getCategory());
        this.setPrice(item.getPrice());
        this.setId(item.getId());
        this.setName(item.getName());
        return item;
    }

    @Override
    public String toString() {
        return ("is : " + id + " price " + price + " category: " + category.name() + "name  : " + name);
    }

}
