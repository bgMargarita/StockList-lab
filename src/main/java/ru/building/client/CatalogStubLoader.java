package ru.building.client;

import ru.building.stocklist.Category;
import ru.building.stocklist.FoodItem;
import ru.building.stocklist.GenericItem;
import ru.building.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {

    public void load(ItemCatalog cat) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, new FoodItem("analog"), new Date(), (short) 10);
        try {
            cat.addItem(item1);
            cat.addItem(item2);

        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getMessage());// TODO Auto-generated catch block
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }
}
