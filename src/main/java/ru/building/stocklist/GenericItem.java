package ru.building.stocklist;

public class GenericItem {
    private static int currentID;

    private int id;
    private String name;
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

    public GenericItem(String name, float price, Category category) {//3 lab
        setName(name);
        setCategory(category);
        setPrice(price);
        setId(GenericItem.getCurrentID() + 1);
    }


    GenericItem(String name, float price, GenericItem analog) {//3lab
        setName(name);
        setCategory(analog.category);
        setPrice(price);
        setId(GenericItem.getCurrentID() + 1);
//         setId(GenericItem.currentID++);

    }

    GenericItem() {
    }

    public void printAll() {

        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , Category: %-20s \n", getId(), getName(), getPrice(), getCategory().name());

    }

    boolean equals(GenericItem o) {
        return (getPrice() == o.getPrice() && getId() == o.getId() && getName().equals(o.getName()) && getCategory().equals(o.getCategory()));
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
