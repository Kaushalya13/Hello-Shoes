package lk.ijse.gdse.hello_shoes.service;

import lk.ijse.gdse.hello_shoes.dto.InventoryDTO;

import java.util.List;

public interface InventoryService {
    boolean saveInventory(InventoryDTO inventoryDTO);
    boolean updateInventory(String id, InventoryDTO inventoryDTO);
    boolean deleteInventory(String  id);
    List<InventoryDTO> getAllInventory();
}
