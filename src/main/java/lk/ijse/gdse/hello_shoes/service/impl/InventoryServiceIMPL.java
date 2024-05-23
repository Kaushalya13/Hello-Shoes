package lk.ijse.gdse.hello_shoes.service.impl;

import lk.ijse.gdse.hello_shoes.dao.InventoryRepo;
import lk.ijse.gdse.hello_shoes.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoes.entity.Inventory;
import lk.ijse.gdse.hello_shoes.service.InventoryService;
import lk.ijse.gdse.hello_shoes.util.Mapping;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class InventoryServiceIMPL implements InventoryService {
    private final InventoryRepo inventoryRepo;
    private final Mapping mapping;

    @Override
    public boolean saveInventory(InventoryDTO inventoryDTO) {
        Inventory save = inventoryRepo.save(mapping.toInventoryEntity(inventoryDTO));
        return save != null;
    }

    @Override
    public boolean updateInventory(String id, InventoryDTO inventoryDTO) {
        Optional<Inventory> inventory = inventoryRepo.findById(id);
        if (inventory.isPresent()){
            inventory.get().setItem_des(inventoryDTO.getItem_des());
            inventory.get().setItem_qty(inventoryDTO.getItem_qty());
            inventory.get().setItem_pic(inventoryDTO.getItem_pic());
            inventory.get().setCategory(inventoryDTO.getCategory());
            inventory.get().setGenderType(inventoryDTO.getGenderType());

            return true;
        }
        return false;
    }

    @Override
    public boolean deleteInventory(String id) {
        Optional<Inventory> inventory = inventoryRepo.findById(id);
        if (inventory.isPresent()){
            inventoryRepo.delete(inventory.get());
            return true;
        }
        return false;
    }

    @Override
    public List<InventoryDTO> getAllInventory() {
        return mapping.toInventoryList(inventoryRepo.findAll());
    }

    @Override
    public String generateId(String occupation, String gender) {
        return null;
    }

    @Override
    public boolean updateImg(String itemCode, String pic) {
        return false;
    }

    @Override
    public List<String> getSize(String itemCode) {
        return null;
    }
}
