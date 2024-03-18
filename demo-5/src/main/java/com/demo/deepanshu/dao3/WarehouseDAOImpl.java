package com.demo.deepanshu.dao3;

import com.demo.deepanshu.model3.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WarehouseDAOImpl implements WarehouseDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Warehouse> getAllWarehouses() {
        String sql = "SELECT * FROM warehouse";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Warehouse.class));
    }

    @Override
    public Warehouse getWarehouseById(Long warehouseId) {
        String sql = "SELECT * FROM warehouse WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Warehouse.class), warehouseId);
    }

    @Override
    public void addWarehouse(Warehouse warehouse) {
        String sql = "INSERT INTO warehouse (location) VALUES (?)";
        jdbcTemplate.update(sql, warehouse.getLocation());
    }

    @Override
    public void updateWarehouse(Long warehouseId, Warehouse warehouse) {
        String sql = "UPDATE warehouse SET location = ? WHERE id = ?";
        jdbcTemplate.update(sql, warehouse.getLocation(), warehouseId);
    }

    @Override
    public void deleteWarehouse(Long warehouseId) {
        String sql = "DELETE FROM warehouse WHERE id = ?";
        jdbcTemplate.update(sql, warehouseId);
    }
}
