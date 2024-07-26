package edu.icet.rental_management_system.bo;

import edu.icet.rental_management_system.dto.Item;
import edu.icet.rental_management_system.entity.ItemEntity;

public interface ItemBo {
    void addItem(Item item);

    Item searchById(Long itemId);

    void deleteById(Long itemId);

    void delete(Item item);

    Iterable<ItemEntity> getAll();
}
