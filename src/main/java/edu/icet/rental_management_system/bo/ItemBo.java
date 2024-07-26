package edu.icet.rental_management_system.bo;

import edu.icet.rental_management_system.dto.Item;

public interface ItemBo {
    void addItem(Item item);

    Item searchById(Long itemId);

    void deleteById(Long itemId);

    void delete(Item item);
}
