package com.demo.deepanshu.dao2;
import com.demo.deepanshu.model2.Supplier_Info;
import java.util.List;

public interface Supplier_dao {
	 int save(Supplier_Info supplier);
	    int update(Supplier_Info supplier, Long id);
	    int delete(Long id);
	    List<Supplier_Info> getAllSuppliers();
	    Supplier_Info getSupplierById(Long id);

}
