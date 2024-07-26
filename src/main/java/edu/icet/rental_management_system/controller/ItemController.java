package edu.icet.rental_management_system.controller;

import edu.icet.rental_management_system.bo.ItemBo;
import edu.icet.rental_management_system.dto.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/v4")
public class ItemController {
    final ItemBo itemBo;

    @PostMapping("/add-item")
    public void add(@RequestBody Item item){
        itemBo.addItem(item);
    }
}
