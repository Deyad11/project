package com.demo.deepanshu.Controller3;

import com.demo.deepanshu.dao3.WarehouseDAO;
import com.demo.deepanshu.model3.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouses")
public class WarehouseController {

    @Autowired
    private WarehouseDAO warehouseDAO;

    @GetMapping("/all")
    public List<Warehouse> getAllWarehouses() {
        return warehouseDAO.getAllWarehouses();
    }

    public Warehouse getWarehouseById(@PathVariable Long id) {
        return warehouseDAO.getWarehouseById(id);
    }
    @PostMapping("/add")
    public String addWarehouse(@RequestBody Warehouse warehouse) {
        warehouseDAO.addWarehouse(warehouse);
        return "Warehouse added successfully";
    }
    @PutMapping("/update/{id}")
    public String updateWarehouse(@RequestBody Warehouse warehouse, @PathVariable Long id) {
        warehouseDAO.updateWarehouse(id, warehouse);
        return "Warehouse updated successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteWarehouse(@PathVariable Long id) {
        warehouseDAO.deleteWarehouse(id);
        return "Warehouse deleted successfully";
    }
}
