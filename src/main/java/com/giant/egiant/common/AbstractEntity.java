package com.giant.egiant.common;

import javax.persistence.MappedSuperclass;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
@MappedSuperclass
public abstract class AbstractEntity {

    private String name;
    private String nameEn;
    private String desc;
    private String descEn;


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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }
}
