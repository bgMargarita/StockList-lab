package ru.building.client;

import ru.building.stocklist.*;
import ru.itmo.exceptions.CatalogLoadException;

public interface CatalogLoader {

    public void load(ItemCatalog cat) throws CatalogLoadException;
}
