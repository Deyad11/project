package com.demo.deepanshu.dao4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.deepanshu.model4.supplierorder;

import java.sql.Timestamp;
import java.util.List;
@Repository
public class supplierorderIMP implements supplierorderDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	 @Override
	    public int save(supplierorder order) {
	        String sql = "INSERT INTO supplier_order (supplier_id, inventory_item_id, order_quantity, order_date) " +
	                "VALUES (?, ?, ?, ?)";
	        int rowsAffected = jdbcTemplate.update(sql,
	                order.getSupplierId(),
	                order.getInventoryItemId(),
	                order.getOrderQuantity(),
	                order.getOrderDate());
	        return rowsAffected;
	    }
    @Override
    public List<supplierorder> getOrdersBySupplier(Long supplierId) {
        String sql = "SELECT * FROM supplier_order WHERE supplier_id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(supplierorder.class), supplierId);
    }
    @Override
    public List<supplierorder> getOrdersByItem(Long itemId) {
        String sql = "SELECT * FROM supplier_order WHERE inventory_item_id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(supplierorder.class), itemId);
    }
    @Override
    public List<supplierorder> getAllOrders() {
        String sql = "SELECT * FROM supplier_order";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(supplierorder.class));
    }
}