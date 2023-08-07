/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Buddika Isuranga
 */
public class ItemModel {
    
    private String itemCode;
    private String description;
    private String packSize;
    private double unitPrice;
    private int qoh;

    public ItemModel() {
    }

    public ItemModel(String itemCode, String description, String packSize, double unitPrice, int qoh) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "itemModel{" + "itemCode=" + itemCode + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }

    public Object getItemModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getDepcription() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
}
