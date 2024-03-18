package com.demo.deepanshu.dao2;

import com.demo.deepanshu.model2.Supplier_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Supplier_IMP implements Supplier_dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Supplier_Info supplier) {
        String sql = "INSERT INTO supplier (name, contact_person) VALUES (?, ?)";
        return jdbcTemplate.update(sql, supplier.getName(), supplier.getContactNumber());
    }

    @Override
    public int update(Supplier_Info supplier, Long id) {
        String sql = "UPDATE supplier SET name = ?, contact_person = ? WHERE id = ?";
        return jdbcTemplate.update(sql, supplier.getName(), supplier.getContactNumber(), id);
    }

    @Override
    public int delete(Long id) {
        String sql = "DELETE FROM supplier WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Supplier_Info> getAllSuppliers() {
        String sql = "SELECT * FROM supplier";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Supplier_Info.class));
    }

    @Override
    public Supplier_Info getSupplierById(Long id) {
        String sql = "SELECT * FROM supplier WHERE id = ?";
        List<Supplier_Info> suppliers = jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Supplier_Info.class));
        return suppliers.isEmpty() ? null : suppliers.get(0);
    }
}
