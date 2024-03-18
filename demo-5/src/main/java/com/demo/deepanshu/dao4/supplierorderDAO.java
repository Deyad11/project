package com.demo.deepanshu.dao4;
import java.util.*;

import com.demo.deepanshu.model.inventory_item;
import com.demo.deepanshu.model4.supplierorder;
public interface supplierorderDAO {
    int save(supplierorder order);
	    List<supplierorder> getOrdersBySupplier(Long supplierId);
	    List<supplierorder> getOrdersByItem(Long itemId);
	    List<supplierorder> getAllOrders();}