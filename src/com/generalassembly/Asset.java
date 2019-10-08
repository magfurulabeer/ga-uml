package com.generalassembly;

public class Asset {
    private int id;
    private double shares;
    private double purchasePrice;

    public int getId() {
        return id;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }

    protected double calculateValue() {
        return shares * purchasePrice;
    }
}
