package com.fa.training.entities;

public class AdvertisingContract {

    private int id;
    private int playerId;
    private int brandId;
    private double dealValue;

    public AdvertisingContract() {
    }

    public AdvertisingContract(int playerId, int brandId, double dealValue) {
        this.playerId = playerId;
        this.brandId = brandId;
        this.dealValue = dealValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public double getDealValue() {
        return dealValue;
    }

    public void setDealValue(double dealValue) {
        this.dealValue = dealValue;
    }

    @Override
    public String toString() {
        return "AdvertisingContract{" +
                "id=" + id +
                ", playerId=" + playerId +
                ", brandId=" + brandId +
                ", dealValue=" + dealValue +
                '}';
    }
}
