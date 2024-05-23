package lk.ijse.gdse.hello_shoes.service;

import lk.ijse.gdse.hello_shoes.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {
    SupplierDTO saveSupplier(SupplierDTO supplierDTO);
    boolean updateSupplier(String id,SupplierDTO supplierDTO);
    boolean deleteSupplier(String id);
    List<SupplierDTO> getAllSupplier();
    String generateId();
    List<String> getSupplierIds();
}
