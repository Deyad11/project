package com.demo.deepanshu.model4;
import java.sql.Timestamp;

public class supplierorder {
	 private int id;
	    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getInventoryItemId() {
		return inventoryItemId;
	}
	public void setInventoryItemId(int inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
		private int supplierId;
	    private int inventoryItemId;
	    private int orderQuantity;
	    private Timestamp orderDate;
	    public supplierorder() {
	    }
	    public supplierorder(int id, int supplierId, int inventoryItemId, int orderQuantity, Timestamp orderDate) {
	        this.id = id;
	        this.supplierId = supplierId;
	        this.inventoryItemId = inventoryItemId;
	        this.orderQuantity = orderQuantity;
	        this.orderDate = orderDate;
	    }
}