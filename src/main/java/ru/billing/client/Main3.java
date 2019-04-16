package ru.billing.client;

import ru.billing.stocklist.*;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.Arrays;
import java.util.Date;

public class Main3 {

    public static void main(String[] args) {

        String line = "Конфеты’Маска’;45;120";
        String[] item_fld = line.split(";");
        System.out.println(Arrays.toString(item_fld));
        FoodItem foodItem = new FoodItem(Arrays.toString(item_fld));

        //4 lab
        ItemCatalog itemCatalog = new ItemCatalog();
        GenericItem genericItem = new GenericItem("name", 10, Category.GENERAL);
        GenericItem genericItem2 = new GenericItem("name2", 10, Category.GENERAL);

        try {
            itemCatalog.addItem(genericItem);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            itemCatalog.addItem(genericItem2);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }

        long begin = new Date().getTime();
        for (int i = 0; i < 100000; i++) itemCatalog.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));
        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++) itemCatalog.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));

        //4lab 3
        CatalogLoader loader = new CatalogStubLoader();
        try {
            loader.load(itemCatalog);
        } catch (CatalogLoadException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
