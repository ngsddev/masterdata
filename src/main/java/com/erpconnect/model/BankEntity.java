package com.erpconnect.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bank", schema = "public", catalog = "masterdata")
public class BankEntity {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bank_id")
    private String bank_id;
    @Basic
    @Column(name = "bank_name")
    private String bank_name;

    public BankEntity() {
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankEntity that = (BankEntity) o;
        return Objects.equals(bank_id, that.bank_id) && Objects.equals(bank_name, that.bank_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bank_id, bank_name);
    }
}
