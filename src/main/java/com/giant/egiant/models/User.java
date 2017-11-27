package com.giant.egiant.models;

import com.giant.egiant.common.BaseEntity;
import com.giant.egiant.enums.EStatus;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
@Entity
@Table(name = "tb_user")
public class User extends BaseEntity{

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private EStatus eStatus;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EStatus geteStatus() {
        return eStatus;
    }

    public void seteStatus(EStatus eStatus) {
        this.eStatus = eStatus;
    }
}
