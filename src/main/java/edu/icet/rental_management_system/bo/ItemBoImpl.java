package edu.icet.rental_management_system.bo;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.rental_management_system.dto.Item;
import edu.icet.rental_management_system.entity.ItemEntity;
import edu.icet.rental_management_system.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ItemBoImpl implements ItemBo {
    final ItemRepository repository;
    final ObjectMapper mapper;
    @Override
    public void addItem(Item item) {
        repository.save(
                mapper.convertValue(item, ItemEntity.class)
        );
    }

    @Override
    public Item searchById(Long itemId) {
        ItemEntity byItemId = repository.findByItemId(itemId);
        return mapper.convertValue(byItemId, Item.class);
    }

    @Override
    public void deleteById(Long itemId) {
        repository.deleteById(itemId);
    }

    @Override
    public void delete(Item item) {
        repository.delete(
                mapper.convertValue(item, ItemEntity.class)
        );
    }


}
