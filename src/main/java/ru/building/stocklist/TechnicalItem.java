package ru.building.stocklist;

import ru.building.client.*;

public class TechnicalItem extends GenericItem {

    public short warrantyTime;

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public short getWarrantyTime() {
        return warrantyTime;
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println(", warrantyTime:  " + getWarrantyTime());

    }

    @Override
    public boolean equals(GenericItem o) {
        return (super.equals(o) && getWarrantyTime() == ((TechnicalItem) o).getWarrantyTime());
    }

    @Override
    public String toString() {
        return ("id : " + getId() + " price " + getPrice() + " category: " + getCategory().name() + "name  : " + getName() + " warrantyTime : " + getWarrantyTime());
    }

    @Override
    public TechnicalItem clone() {
        TechnicalItem item = (TechnicalItem) super.clone();
        item.setWarrantyTime(this.getWarrantyTime());
        return item;
    }
}
