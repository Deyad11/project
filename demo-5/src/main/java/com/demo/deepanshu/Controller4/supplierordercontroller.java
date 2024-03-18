package com.demo.deepanshu.Controller4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.deepanshu.dao4.supplierorderDAO;
import com.demo.deepanshu.model.inventory_item;
import com.demo.deepanshu.model4.supplierorder;

import java.util.List;
@RestController
@RequestMapping("/api/supplierorder")
public class supplierordercontroller {
    @Autowired
    private supplierorderDAO supplierOrderDAO;
    @PostMapping("/order")
    public String addSupplierOrder(@RequestBody supplierorder order) {
        int rowsAffected = supplierOrderDAO.save(order);

        if (rowsAffected > 0) {
            return "Supplier order added successfully";
        } else {
            return "Failed to add supplier order";
        }
    }

    @GetMapping("/bysupplier/{supplierId}")
    public List<supplierorder> getOrdersBySupplier(@PathVariable Long supplierId) {
        return supplierOrderDAO.getOrdersBySupplier(supplierId);
    }
    @GetMapping("/byitem/{itemId}")
    public List<supplierorder> getOrdersByItem(@PathVariable Long itemId) {
        return supplierOrderDAO.getOrdersByItem(itemId);
    }
    @GetMapping("/all")
    public List<supplierorder> getAllOrders() {
        return supplierOrderDAO.getAllOrders();
    }
}