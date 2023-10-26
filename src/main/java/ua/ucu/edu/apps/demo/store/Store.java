package ua.ucu.edu.apps.demo.store;

import java.util.ArrayList;
import java.util.List;

import ua.ucu.edu.apps.demo.store.filter.SearchFilter;

public class Store {

    private List<Item> items;

    public List<Item> search(SearchFilter filter) {

        List<Item> foundItems = new ArrayList<>();

        for (Item item: items) {
            if (filter.match(item))  {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
