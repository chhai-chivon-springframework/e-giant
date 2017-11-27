package com.giant.egiant.common;

import sun.rmi.runtime.Log;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
@MappedSuperclass
public abstract class BaseEntity extends AbstractEntity implements Serializable {

    private Log id;


    public Log getId() {
        return id;
    }

    public void setId(Log id) {
        this.id = id;
    }
}
