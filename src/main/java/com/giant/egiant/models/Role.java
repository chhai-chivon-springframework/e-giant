package com.giant.egiant.models;

import com.giant.egiant.common.BaseEntity;
import com.giant.egiant.enums.EStatus;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
@Entity
@Table(name = "tb_role")
public class Role extends BaseEntity{

    private String name;
    private EStatus  eStatus;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EStatus geteStatus() {
        return eStatus;
    }

    public void seteStatus(EStatus eStatus) {
        this.eStatus = eStatus;
    }
}
