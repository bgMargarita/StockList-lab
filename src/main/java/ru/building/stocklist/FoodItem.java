package ru.building.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;

    private short expires;

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        // setName(name);
        new FoodItem(name);
        setPrice(price);
        setDateOfIncome(date);
        setExpires(expires);
        this.setCategory(analog.getCategory());
    }

    public FoodItem(String name) {
        setName(name);
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, new FoodItem(name), new Date(123456789), expires);
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println(", expires: " + getExpires() + ",  dateOfIncome:  " + getDateOfIncome());

    }

    @Override
    public boolean equals(GenericItem o) {
        return (super.equals(o) && dateOfIncome.equals(((FoodItem) o).dateOfIncome) && expires == ((FoodItem) o).expires);
    }

    @Override
    public String toString() {
        return ("is : " + getId() + " price " + getPrice() + " category: " + getCategory().name() + "name  : " + getName() + " expires: " + getExpires() + " date of income " + getDateOfIncome());
    }

    @Override
    public FoodItem clone() {
        FoodItem item = (FoodItem) super.clone();
        item.setExpires(this.getExpires());
        item.setDateOfIncome(this.getDateOfIncome());
        return item;
    }
}
