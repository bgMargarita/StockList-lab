package ru.billing.client;

import ru.billing.stocklist.Category;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {

    public void load(ItemCatalog cat) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, new FoodItem("analog"), new Date(), (short) 10);

        try {
            cat.addItem(item1);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            e.getMessage();
            throw new CatalogLoadException(e);
        }
        try {
            cat.addItem(item2);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            e.getMessage();
            throw new CatalogLoadException(e);
        }

    }
}
