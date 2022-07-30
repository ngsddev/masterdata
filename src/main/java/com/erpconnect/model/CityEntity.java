package com.erpconnect.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city", schema = "public", catalog = "masterdata")
public class CityEntity {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "city_id")
    private String city_id;
    @Basic
    @Column(name = "city_name")
    private String city_name;

    public Object getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityEntity that = (CityEntity) o;
        return city_id == that.city_id && Objects.equals(city_name, that.city_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city_id, city_name);
    }
}
