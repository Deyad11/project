package com.demo.deepanshu.dao3;

import java.util.List;
import com.demo.deepanshu.model3.Warehouse;
public interface WarehouseDAO {
    List<Warehouse> getAllWarehouses();
    Warehouse getWarehouseById(Long warehouseId);
    void addWarehouse(Warehouse warehouse);
    void updateWarehouse(Long warehouseId, Warehouse warehouse);
    void deleteWarehouse(Long warehouseId);
}