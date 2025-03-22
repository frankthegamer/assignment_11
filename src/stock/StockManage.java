package stock;

import item.Item;

public interface StockManage  {
    void add(Item item, int quantity);
    Item get(String id);
    int checkStock(String id);
}