package com.erpconnect.model;

public class BranchByCityRequestModel {
    private String bank_id;
    private String city_id;

    public BranchByCityRequestModel() {
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }
}
