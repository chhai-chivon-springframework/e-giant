package com.giant.egiant.common;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  id;

    public long  getId() {
        return id;
    }

}
