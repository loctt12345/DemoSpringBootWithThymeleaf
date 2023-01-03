/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loctt.springbootthymeleaf.model;

/**
 *
 * @author loc12345
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblUsers")
public class User implements Serializable {
    @Id
    private String userID;
    private String fullName;    
    private String password;
    private String roleID;
    private boolean status;

    public User() {
    }

    public User(String userID, String fullName, String password, String roleID, boolean status) {
        this.userID = userID;
        this.fullName = fullName;
        this.password = password;
        this.roleID = roleID;
        this.status = status;
    }
    
    

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the roleID
     */
    public String getRoleID() {
        return roleID;
    }

    /**
     * @param roleID the roleID to set
     */
    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
