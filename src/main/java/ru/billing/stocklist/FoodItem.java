package ru.billing.stocklist;

import java.util.Date;
import java.util.Objects;

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
        this.setName(name);
        this.setPrice(price);
        this.setAnalog(analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name) {
        this(name, 100f, null, null, (short) 12);

    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, null, expires);
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println(", expires: " + getExpires() + ",  dateOfIncome:  " + getDateOfIncome());

    }

    @Override
    public boolean equals(Object o) {

        return (super.equals(o) && dateOfIncome.equals(((FoodItem) o).dateOfIncome) && expires == ((FoodItem) o).expires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfIncome, expires);
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
