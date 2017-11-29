package com.giant.egiant.models;

import com.giant.egiant.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * @author by chhai.chivon  on 11/27/17.
 */
@Entity
@Table(name = "tb_category")
public class Category extends BaseEntity {

    private String name;
    private String nameEn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}
