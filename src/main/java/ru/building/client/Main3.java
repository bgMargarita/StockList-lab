package ru.building.client;

import ru.building.stocklist.*;

import java.util.Arrays;
import java.util.Date;

public class Main3 {

    public static void main(String[] args) {

        String line = "Конфеты’Маска’;45;120";
        String[] item_fld = line.split(";");
        System.out.println(Arrays.toString(item_fld));
        // FoodItem foodItem = new FoodItem(item_fld); не получилось

        //4 lab
        ItemCatalog itemCatalog = new ItemCatalog();
        GenericItem genericItem = new GenericItem("name", 10, Category.GENERAL);
        GenericItem genericItem2 = new GenericItem("name2", 10, Category.GENERAL);

        itemCatalog.addItem(genericItem);
        itemCatalog.addItem(genericItem2);

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
        loader.load(itemCatalog);

    }
}
