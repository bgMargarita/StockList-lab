package ru.building.client;

import ru.building.stocklist.Category;
import ru.building.stocklist.FoodItem;
import ru.building.stocklist.GenericItem;
import ru.building.stocklist.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {

    public void load(ItemCatalog cat) {
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, new FoodItem("analog"), new Date(), (short) 10);
        cat.addItem(item1);
        cat.addItem(item2);
    }
}
