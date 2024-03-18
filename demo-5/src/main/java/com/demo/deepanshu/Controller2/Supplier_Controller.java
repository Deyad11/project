package com.demo.deepanshu.Controller2;

import com.demo.deepanshu.dao2.*;
import com.demo.deepanshu.model2.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class Supplier_Controller {

    @Autowired
    private Supplier_dao supplierDao;

    @GetMapping("/all")
    public List<Supplier_Info> getAllSuppliers() {
        return supplierDao.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public Supplier_Info getSupplierById(@PathVariable Long id) {
        return supplierDao.getSupplierById(id);
    }

    @PostMapping("/add")
    public String addSupplier(@RequestBody Supplier_Info supplier) {
        int rowsAffected = supplierDao.save(supplier);

        if (rowsAffected > 0) {
            return "Supplier added successfully";
        } else {
            return "Failed to add supplier";
        }
    }

    @PutMapping("/update/{id}")
    public String updateSupplier(@RequestBody Supplier_Info supplier, @PathVariable Long id) {
        int rowsAffected = supplierDao.update(supplier, id);

        if (rowsAffected > 0) {
            return "Supplier updated successfully";
        } else {
            return "Failed to update supplier";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSupplier(@PathVariable Long id) {
        int rowsAffected = supplierDao.delete(id);

        if (rowsAffected > 0) {
            return "Supplier deleted successfully";
        } else {
            return "Failed to delete supplier";
        }
    }
}
