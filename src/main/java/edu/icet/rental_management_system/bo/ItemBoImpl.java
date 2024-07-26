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

}