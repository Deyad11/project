package com.demo.deepanshu.model3;
public class Warehouse {
    private Long id;
    private String location;

    // Constructors
    public Warehouse() {}

    public Warehouse(Long id, String location, int capacity) {
        this.id = id;
        this.location = location;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}