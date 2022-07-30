package com.erpconnect.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "branch", schema = "public", catalog = "masterdata")
public class BranchEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "branch_id")
    private int branch_id;
    @Basic
    @Column(name = "city_id")
    private String city_id;
    @Basic
    @Column(name = "branch_name")
    private String branch_name;
    @Basic
    @Column(name = "branch_code")
    private String branchCode;
    @Basic
    @Column(name = "bank_id")
    private String bank_id;

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BranchEntity that = (BranchEntity) o;
        return branch_id == that.branch_id && city_id == that.city_id && Objects.equals(branch_name, that.branch_name) && Objects.equals(branchCode, that.branchCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch_id, city_id, branch_name, branchCode);
    }


    public Object getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }
}
