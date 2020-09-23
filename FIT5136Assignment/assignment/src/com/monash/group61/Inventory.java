package com.monash.group61;


public class Inventory {
    private int itemId;
    private String itemName;
    private int itemQuantityInStock;
    private String dateInventoryAdded;

    public Inventory() {
    }

    public Inventory(int itemId, String itemName, int itemQuantityInStock, String dateInventoryAdded) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemQuantityInStock = itemQuantityInStock;
        this.dateInventoryAdded = dateInventoryAdded;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantityInStock() {
        return itemQuantityInStock;
    }

    public void setItemQuantityInStock(int itemQuantityInStock) {
        this.itemQuantityInStock = itemQuantityInStock;
    }

    public String getDateInventoryAdded() {
        return dateInventoryAdded;
    }

    public void setDateInventoryAdded(String dateInventoryAdded) {
        this.dateInventoryAdded = dateInventoryAdded;
    }
}
