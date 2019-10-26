package com.cxl.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Employee {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称lastname
     */
    private String lastname;

    /**
     * 邮件
     */
    private String email;

    /**
     * 年纪
     */
    private Integer gender;

    /**
     * 部门
     */
    private Integer dId;

    public Employee(Integer id, String lastname, String email, Integer gender, Integer dId) {
        this.id = id;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.dId = dId;
    }

    public Employee() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}